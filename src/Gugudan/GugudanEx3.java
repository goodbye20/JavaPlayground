package Gugudan;
import java.util.Scanner;
public class GugudanEx3 {
	

	    public static void main(String[] args) {
	        // 사용자가 입력한 값을 문자열(String)로 받는다.
	        Scanner scanner = new Scanner(System.in);
	        String inputValue = scanner.nextLine();

	        // 사용자가 입력한 값을 쉼표(,)를 기준으로 분리한다.
	        String[] splitedValue = inputValue.split(",");

	        // 쉼표를 기준으로 분리한 문자열을 숫자로 변환한다.
	        int first = Integer.parseInt(splitedValue[0].strip());
	        int second = Integer.parseInt(splitedValue[1].strip());

	        // 2중으로 반복문(for 또는 while)을 실행해 곱셈 결과를 화면에 출력한다.
	        for (int i = 1; i <= first; i++) {
	            for (int j = 1; j <= second; j++) {
	                System.out.println( i * j);
	            }
	           System.out.println();
	        }
	    }
	}

