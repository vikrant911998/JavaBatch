package practice1;

public class OverloadingDemo {
	//instance variable
	int speed = 0;
	
	
	//methods
	void play(){
		System.out.println("Default Function");
	}
	
	void play(int a) {
		System.out.println("One argument play method");
	}
	
	void play(String s) {
		System.out.println("String play method");
	}
	
	String play(double d) {
		return"i am return type method";
	}
	
	public static void main(String[] args) {
		OverloadingDemo od1 = new OverloadingDemo();
		System.out.println(od1.play(5.0996));
	}

}
