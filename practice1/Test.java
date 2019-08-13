package practice1;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		ArrayList<Employee>  list =new  ArrayList<>();
		
		Employee e1 = new Employee(1);
		Employee e2 = new Employee(2);
		Employee e3 = new Employee(3);
		
		e1.input();
		list.add(e1);
		e2.input();
		list.add(e2);
		e3.input();
		list.add(e3);
		
		for(Employee e:list) {
			e.output();
			System.out.println();
		}
	}

}
