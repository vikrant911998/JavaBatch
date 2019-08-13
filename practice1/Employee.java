package practice1;

import java.util.Scanner;

public class Employee {
	
	String name;
	int id;
	double salary;
	long mobileno;
	
	Scanner sc = new Scanner(System.in);
	
	Employee(int id){
		this.id = id;
	}
	void input() {
		System.out.println("Enter the Name of the Employee");
		this.name = sc.nextLine();
		
		System.out.println("Enter the salary of the Employee");
		this.salary =  sc.nextDouble();
		
		System.out.println("Enter the Mobile Number");
		this.mobileno = sc.nextLong();
	}
	
	void output() {
		System.out.println("Name is "+this.name);
		System.out.println("Id is "+this.id);
		System.out.println("Salary is "+this.salary);
		System.out.println("Mobile Number is "+this.mobileno);
	}

}
