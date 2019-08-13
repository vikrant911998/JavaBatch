package practice1;


class ParentConstructor{
	
	ParentConstructor(){
		System.out.println("Parent Default Constructor");
	}
	
	ParentConstructor(int a){
		System.out.println("Parent Parameterised Constructor");
	}
}

class ChildConstructor extends ParentConstructor{
	
	ChildConstructor() {
		super(2);
		System.out.println("Child Default Constructor");
	}
}

class Child2 extends ChildConstructor {
	Child2(){
		super();
		System.out.println("Child2 Default Constructor");
	}
}


public class InheritanceDemo2 {

	public static void main(String[] args) {
		Child2 cc1 = new Child2();
	}

}
