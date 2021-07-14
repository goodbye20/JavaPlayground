package Calender;

import java.util.Scanner;

public class CalenderEx {
	private final static String PROMPT1 = "Year> ";
	private final static String PROMPT2 = "Month> ";
	static int[] maxDays = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	static int[] leapMaxDays = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public static int getMaxDaysOfMonth(int year, int month) {
		return maxDays[month - 1];
	}

	public static int getLeapMaxDaysOfMonth(int year, int month) {
		return leapMaxDays[month - 1];
	}

	public static void main(String[] args) {
		Calender cal = new Calender();

		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("년도를 입력하세요");
			int year = scanner.nextInt();
			System.out.println(PROMPT1 + year);
			System.out.println("달을 입력하세요.");
			int month = scanner.nextInt();
			System.out.println(PROMPT2 + month);
			if (month == -1) {
				break;
			} else if (month > 12) {
				continue;
			}
			System.out.println("      "+year+"년  " + month + "월");
			System.out.println(" SU MO TO WE TH FR SA");
			System.out.println("=====================");
			int m1 = getMaxDaysOfMonth(year,month);
			int m2 = getLeapMaxDaysOfMonth(year, month);
			if(year % 4 == 0 && (year % 100 !=0 || year % 400 == 0)) {
			for (int i = 1; i <= m2; i++) {
				System.out.printf("%3d", i);
				if (i % 7 == 0) {
					System.out.println();
				}
			}
			System.out.println();
			} else {
				for (int i = 1; i <= m1; i++) {
					System.out.printf("%3d", i);
					if (i % 7 == 0) {
						System.out.println();
			}
		}
			System.out.println();
		}
		
	}
		System.out.println("완료.");
	}
}
