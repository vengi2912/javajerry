package testingprograms;

import java.util.HashSet;

public class Hashset1 {
	
	
	
	
	

	public static void main(String[] args) {
		
		HashSet<String> cars = new HashSet<String>();
		HashSet<String> newcars = new HashSet<String>();
		
		cars.add("srini");
		cars.add("venkat");
		cars.add("purus");
		cars.add("arul");
		
		System.out.println(cars);
		System.out.println(cars.contains("arul"));
		System.out.println(cars.contains("solai"));
		
		System.out.println(cars.isEmpty());
		System.out.println(newcars.isEmpty());
		
		
		System.out.println(cars.size());
		
		for (String i : cars) {
			System.out.println(i);
		}
		
		
		

	}

}
