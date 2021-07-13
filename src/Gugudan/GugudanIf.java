package Gugudan;

import java.util.Scanner;

public class GugudanIf {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
			System.out.println("구구단을 출력할 단은? :");	
			int number = scanner.nextInt();
			 System.out.println("입력값 :" + number);
			 
			if(number < 2) {
				System.out.println("입력값은 2보다 작을 수 없습니다.");
			} else if(number > 9) {
				System.out.println("입력값은 9보다 클 수 없습니다.");
			} else {
			for(int i = 1; i < 10; i++) {
				System.out.println(number * i);
				
			}
			}
	}
}
