package practice1;

class Parent{
//	private int i = 10;
	protected int i = 10;
	
	void show(int i){
		System.out.println(this.i+"  and  "+i);
	}
	
}

class Child extends Parent{
	void show1(){
		System.out.println(this.i);
	}
}


public class InheritanceDemo1 {
	public static void main(String[] args) {
//		Parent p1 = new Parent();
//		p1.show(6);
		Child c1 = new Child();
		c1.show(6);
		c1.show1();
	}
}
