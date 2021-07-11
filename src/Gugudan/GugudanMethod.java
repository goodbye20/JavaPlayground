package Gugudan;

public class GugudanMethod {
	public static int[] calculate(int times) {
		int[] result = new int[9];
		for(int i = 0; i < result.length; i++) {
	
		
		result[i] =  times * (i+1);
		
		}
		return result;
	}
	
		
		
	public static void main(String[] args) {
			int[] result = calculate(2);
			for(int i=0; i < result.length; i++) {
			System.out.println(result[i]);
	}
	}
}
