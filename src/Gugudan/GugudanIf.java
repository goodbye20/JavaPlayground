package Gugudan;

import java.util.Scanner;

public class GugudanIf {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
			System.out.println("�������� ����� ����? :");	
			int number = scanner.nextInt();
			 System.out.println("�Է°� :" + number);
			 
			if(number < 2) {
				System.out.println("�Է°��� 2���� ���� �� �����ϴ�.");
			} else if(number > 9) {
				System.out.println("�Է°��� 9���� Ŭ �� �����ϴ�.");
			} else {
			for(int i = 1; i < 10; i++) {
				System.out.println(number * i);
				
			}
			}
	}
}
