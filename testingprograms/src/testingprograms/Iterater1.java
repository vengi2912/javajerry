package testingprograms;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterater1 {

	public static void main(String[] args) {
ArrayList<String> cars =new ArrayList<String>();
		
		ArrayList<Integer> marks =new ArrayList<Integer>();
		
		cars.add("venkat");
		cars.add("srini");
		cars.add("solai");
		cars.add("gd");
		
		marks.add(14);
		marks.add(7);
		marks.add(6);
		marks.add(15);
		marks.add(3);
		
		System.out.println(marks);
		// iterrater
		
		Iterator<String> mycar = cars.iterator();
		
//			System.out.println(mycar.hasNext());
//			System.out.println(mycar.next());
			//System.out.println(mycar.forEachRemaining(null));
			
			while(mycar.hasNext()) {
				System.out.println(mycar.next());
			}
		Iterator<Integer> mynum = marks.iterator();
		
		while(mynum.hasNext()) {
			Integer i= mynum.next();
			if(i>10) {
				mynum.remove();
			}
		}
		
		System.out.println(marks);
			}
		
			
			
	}

