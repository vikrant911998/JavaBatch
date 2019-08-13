package practice1;

class A {
	
	void run(){
		System.out.println("A's run");
	}
		
}

class B extends A{
	int r,p;
	
	B(){
		this.r = 2;
		this.p = 5;
	}
	
	@Override
	void run() {
		System.out.println("B's run");
	}
	
	void play() {
		System.out.println("B's play");
	}
	
	
}

public class InheritanceDemo {
	
	public static void main(String[] args) {
//		A a1 = new A();
		B b1 = new B();
		System.out.println("B's r value is "+b1.r);
		System.out.println("B's p value is "+b1.p);
		b1.run();
		b1.play();

	}

}
