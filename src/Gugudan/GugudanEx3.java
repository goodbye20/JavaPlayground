package Gugudan;
import java.util.Scanner;
public class GugudanEx3 {
	

	    public static void main(String[] args) {
	        // ����ڰ� �Է��� ���� ���ڿ�(String)�� �޴´�.
	        Scanner scanner = new Scanner(System.in);
	        String inputValue = scanner.nextLine();

	        // ����ڰ� �Է��� ���� ��ǥ(,)�� �������� �и��Ѵ�.
	        String[] splitedValue = inputValue.split(",");

	        // ��ǥ�� �������� �и��� ���ڿ��� ���ڷ� ��ȯ�Ѵ�.
	        int first = Integer.parseInt(splitedValue[0].strip());
	        int second = Integer.parseInt(splitedValue[1].strip());

	        // 2������ �ݺ���(for �Ǵ� while)�� ������ ���� ����� ȭ�鿡 ����Ѵ�.
	        for (int i = 1; i <= first; i++) {
	            for (int j = 1; j <= second; j++) {
	                System.out.println( i * j);
	            }
	           System.out.println();
	        }
	    }
	}

