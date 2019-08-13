package practice1;

import java.util.ArrayList;

public class ListDemo {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i=0;i<10;i++) {
			list.add(i);
		}
		
		for(int a:list) {
			System.out.println(a);
		}
		
		list.remove(0);
		list.remove(8);
		
		System.out.println("******************");
		for(int a:list) {
			System.out.println(a);
		}

	}

}
