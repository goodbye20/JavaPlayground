package Gugudan;

import java.util.Scanner;

public class GugudanEx2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String inputValue = scanner.nextLine();
		
		String[] splitedValue = inputValue.split(",");
		// 두개의 입력값
		int first = Integer.parseInt(splitedValue[0]);
		int second = Integer.parseInt(splitedValue[1]);
		
		for(int i = 1; i <= first; i++ ) {
			for(int j = 1; j <= second; j++) {
			System.out.printf("%d x %d = %d\n", i, j, i * j);
		}
		System.out.println();
		
	}

	}
}	
