package practice1;

public class SumOfDigit {

	public static void main(String[] args) {
		int x = 3456;
		int sum = 0;
		
//		System.out.println("THe modulus is "+x%10);
		
		while(x != 0) {
			sum += x%10;
			x = x/10;
		}
		System.out.println("The sum of digits is "+sum);

	}

}
