package Calender;

import java.util.Scanner;

public class CalenderAuto {
	private final static String PROMPT1 = "Year> ";
	private final static String PROMPT2 = "Month> ";
	static char[] week = {'일', '월', '화', '수', '목', '금', '토', '일'};
	static int[] maxDays = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	static int[] leapMaxDays = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	public static int getMaxDaysOfMonth(int year, int month) {
		return maxDays[month - 1];
	}
	;
	public static int getLeapMaxDaysOfMonth(int year, int month) {
		return leapMaxDays[month - 1];
	}
	
	public static boolean isLeapYear(int year) {
		if (year % 4 == 0 && (year % 100 !=0 || year % 400 == 0)) {
		return true;
	} else {
		return false;
	}
}	
	private static int getWeekDay(int year, int month, int day) {
		int syear = 1970;
		final int STANDARD_WEEKDAY = 3; //1970/Jan/1st = Thursday

		int count = 0;

		for (int i = syear; i < year; i++) {
			int delta = isLeapYear(i) ? 366 : 365;
			count += delta;
		}

		//System.out.println(count);
		for (int i = 1; i < month; i++) {
			int delta = getMaxDaysOfMonth(year, i);
			count += delta;
		}

		count += day;

		int weekday = (count + STANDARD_WEEKDAY) % 7;
		return weekday;
	}	
	public static void main(String[] args) {
		

		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("년도를 입력하세요 (Exit = -1)");
			int year = scanner.nextInt();
			if (year == -1) {
				break;
			}
			System.out.println(PROMPT1 + year);
			
			System.out.println("달을 입력하세요.");
			int month = scanner.nextInt();
			System.out.println(PROMPT2 + month);
			
			
			if (month > 12) {
				System.out.println("입력할수 있는 월은 12월까지 입니다.");
				System.out.println();
				continue;
			}
			System.out.println("      "+year+"년  " + month + "월");
			System.out.println(" SU MO TO WE TH FR SA");
			System.out.println("=====================");
			int m1 = getMaxDaysOfMonth(year,month);
			int m2 = getLeapMaxDaysOfMonth(year, month);
			
			
			int weekfirstday = getWeekDay(year, month, 1); 

			//print blank space - weekfirstday라는 나머지만큼 공백
			for (int i = 0; i < weekfirstday; i++) {
				System.out.print("   ");
			}
			//print first line - 한 주의 총 일수인 7에서 나머지를 뺴준만큼(count)만 프린트
			int count = 7 - weekfirstday;
			for(int i = 1; i <= count; i++) {
				System.out.printf("%3d", i);
			}
			System.out.println();
			//print second line - last line 
			//count 다음숫자부터 print
			if(year % 4 == 0 && (year % 100 !=0 || year % 400 == 0)) {
			for (int i = count + 1; i <= m2; i++) {
				System.out.printf("%3d", i);
				if (i % 7 == count) {             //결국 첫쨰주의 마지막날 즉 count와 줄을 바꿔줘야할 각 토요일의 %7나머지는 같으므로(count) i%7 = count
					System.out.println();
				}
			}
			System.out.println();
			} else {
				for (int i = count + 1; i <= m1; i++) {
					System.out.printf("%3d", i);
					if (i % 7 == count) {
						System.out.println();
			
					}
		}
			System.out.println();
		}
		
	}
		System.out.println("완료.");
		scanner.close();
	}
}

