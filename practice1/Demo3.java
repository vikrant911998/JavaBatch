package practice1;

public class Demo3 {
	
	//instance variable
	int a=0;
	
	//Default Constructor
	Demo3(){
		this.a = 3;
		System.out.println("This is the Default Constructor");
	}
	
	//Parameterised Constructor -1
	Demo3(int a){
		this.a = a;
		System.out.println("This is the Parameterised Constuctor 1");
	}
	
	//Parameterised Constructor -2
	Demo3(int a, int b){
		this.a = a+b;
		System.out.println("This is the Parameterised Constructor -2");
	}
	
	
	//methods
	
	void call() {
		System.out.println("This is the call method");
	}
	
	
	

}
