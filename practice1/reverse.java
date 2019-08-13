package practice1;

public class reverse {

	public static void main(String[] args) {
		
		int x = 34567;
		
		int reverse = 0;
		
		while(x != 0) {
			int temp = x%10;
			reverse = reverse*10 + temp;//7*10+6=76
			x = x/10;
		}
		
		System.out.println("The result is "+reverse);
	}

}
