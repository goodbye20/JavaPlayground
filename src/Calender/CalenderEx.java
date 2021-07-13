package Calender;

import java.util.Scanner;

public class CalenderEx {
	private final static String PROMPT = "cal> ";
	static int[] maxDays = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public static int getMaxDaysOfMonth(int month) {
		return maxDays[month - 1];
	}

	public static void main(String[] args) {
		Calender cal = new Calender();

		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("달을 입력하세요.");

			int month = scanner.nextInt();
			System.out.println(PROMPT + month);
			if (month == -1) {
				break;
			} else if (month > 12) {
				continue;
			}
			System.out.println("      2021년  " + month + "월");
			System.out.println(" SU MO TO WE TH FR SA");
			System.out.println("=====================");
			int m1 = getMaxDaysOfMonth(month);

			for (int i = 1; i <= m1; i++) {
				System.out.printf("%3d", i);
				if (i % 7 == 0) {
					System.out.println();
				}
			}
			System.out.println();
		}
		System.out.println("완료.");
	}
}
