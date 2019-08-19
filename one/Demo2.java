package one;



class One{
	
	void one() {
		System.out.println("This is One");
//		this.two();
		this.one();
	}
	
	void two() {
		System.out.println("This is two");
	}
}



public class Demo2 {

	public static void main(String[] args) {
		One obj1 = new One();
		obj1.one();
//		obj1.two();

	}

}
