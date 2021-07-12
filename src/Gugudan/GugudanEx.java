package Gugudan;

import java.util.Scanner;

public class GugudanEx {
	//입력한값으로 입력한값까지만 구구단만들기( 88단 만들기, 19단만들기)
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);	
		System.out.println("내가 입력한 값은 :");
		//내가 입력한값
		int number = scanner.nextInt();
		System.out.println("입력값은 :" + number);
		for(int i = 1; i <= number; i++) {
			System.out.println(i * number);
		}
		
		
		
		
		
	}

}
