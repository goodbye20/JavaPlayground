package Calender;


import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
		int a, b;
		Scanner scanner = new Scanner(System.in);
		String s1,s2;
		System.out.println("입력할 두 수를 적으시오");
		s1 = scanner.next();
		s2 = scanner.next();
//		System.out.println(s1 + "," + s2);
		a = Integer.parseInt(s1);
		b = Integer.parseInt(s2);
		
//		System.out.println("두 수의 합은" + (a + b) + "입니다.");
		System.out.printf("%d + %d = %d", a, b, a + b);
		
		scanner.close();
		
		
		
	}

}
