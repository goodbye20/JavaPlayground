package Gugudan;

import java.util.Scanner;

public class GugudanEx {
	//�Է��Ѱ����� �Է��Ѱ������� �����ܸ����( 88�� �����, 19�ܸ����)
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);	
		System.out.println("���� �Է��� ���� :");
		//���� �Է��Ѱ�
		int number = scanner.nextInt();
		System.out.println("�Է°��� :" + number);
		for(int i = 1; i <= number; i++) {
			System.out.println(i * number);
		}
		
		
		
		
		
	}

}
