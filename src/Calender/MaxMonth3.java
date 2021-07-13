package Calender;

import java.util.Scanner;

public class MaxMonth3 {
	private int[] m1 = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public int getMaxDaysOfMonth(int month) {
		return m1[month - 1];
	}

	public static void main(String[] args) {

		MaxMonth2 cal = new MaxMonth2();

		Scanner scanner = new Scanner(System.in);
		int month = 1;
			while(true) {
			System.out.println("달을 입력하세요.");

			month = scanner.nextInt();
			if(month == -1) {
				break;
			}else if(month > 12) {
				continue;
			}
			System.out.println(month + "월은 " + cal.getMaxDaysOfMonth(month) + "일 까지입니다.");
			System.out.println("==============");
			}
		System.out.println("완료.");
		scanner.close();
	}
}
