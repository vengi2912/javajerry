package testingprograms;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class arraylist1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList<String> cars =new ArrayList<String>();
		
		ArrayList<Integer> marks =new ArrayList<Integer>();
		
		cars.add("venkat");
		cars.add("srini");
		cars.add("solai");
		cars.add("gd");
		
		marks.add(95);
		marks.add(70);
		marks.add(63);
		marks.add(82);
		marks.add(99);
		marks.add(78);
		
//		System.out.println(cars);
//		System.out.println(cars.get(0));
//		System.out.println(cars.get(1));
//		
//		cars.set(2 ,"naren");
//		System.out.println(cars.get(2));
		
//		cars.remove(2);
//		cars.clear();
//		System.out.println(cars);
		
		for(int i=0; i<cars.size();i++) {
			System.out.println(cars.get(i));
		}
		
		for(String i:cars) {
		System.out.println(i);
		
		
	}
  
		
		
		
		System.out.println(marks);
		Collections.sort(marks);
		
		for(int j:marks) {
			System.out.println(j);
		}
		
		
		
		
		
}}
