package Calender;

import java.util.Scanner;

public class CalenderExPratice {
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
// [<<<<여기에 앞에 공백생성하는 메소드가 있어야함>>>>]
	//그러러면 총 몇년 지나는지 알수있는 메소드
		//거기에 윤년도 얼마나 끼여있는지 메소드 합해서 더해줘야함
			//거기 %7 만큼 공백 ++++
			// 윤년이면 sum +2 평년이면 sum +1 거기에 1853년 1/1일이 토요일이니 +6 이걸 전체 7로 나눠주면 그해 1월1일 요일
			// 그전달 마지막일수 더해주고 7로 나눠주면 그게 그달 1일의 요일 
			
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
		scanner.close();
	}
}

