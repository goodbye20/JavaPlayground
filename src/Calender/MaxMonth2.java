package Calender;

import java.util.Scanner;

public class MaxMonth2 {
	private int[] m1 = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public int getMaxDaysOfMonth(int month) {
		return m1[month - 1];
	}

	public static void main(String[] args) {

		MaxMonth2 cal = new MaxMonth2();

		Scanner scanner = new Scanner(System.in);

		System.out.println("반복 횟수를 입력하세요");
		int repeat = scanner.nextInt();
		for (int i = 0; i < repeat; i++) {
			System.out.println("달을 입력하세요.");

			int month = scanner.nextInt();
			System.out.println(month + "월은 " + cal.getMaxDaysOfMonth(month) + "일 까지입니다.");
			System.out.println("==============");
		}
		System.out.println("완료.");
       // if (31 == m1[month - 1]) {
//			System.out.println(month + "월은 31일 까지입니다.");
//		} else if (28 == m1[month - 1]) {
//			System.out.println(month + "월은 28일 까지입니다.");
//		} else if (30 == m1[month - 1]) {
//			System.out.println(month + "월은 30일 까지입니다.");
//		}

		scanner.close();
//		Calender calender = new Calender();
//		calender.CalenderSample();
	}
}
