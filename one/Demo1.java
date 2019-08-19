package one;

class A{
	
	void run(){
			System.out.println("A's Run");
	}
}

class B extends A{
	
	void play() {
		System.out.println("B's Play");
	}
}
class C extends B{
	void call() {
		System.out.println("C's call");
	}
}

public class Demo1 {

	public static void main(String[] args) {
		int a = 2;
		double d = (double)a;
//		A obj;
//		A obj = new B();
//		obj.run();
		
		A obj = new C();//Downcasting
		obj.run();
		
		C obj1 = (C) obj ;//Upcasting
		
		
		

	}

}
