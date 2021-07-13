package Calender;

import java.util.Scanner;

public class MaxMonth1 {

	public static void main(String[] args) {
		int[] m1= {31,28,31,30,31,30,31,31,30,31,30,31};
		Scanner scanner = new Scanner(System.in);
		System.out.println("달을 입력하세요");
		int number = scanner.nextInt();
		System.out.println(number+"월은 "+ m1[number-1] +"일까지 있습니다.");
//		if(number == 1 ) {
//			System.out.println(number + "월은 31일까지 있습니다." );
//		}else if
//		System.out.println();
		scanner.close();
	}

	}

