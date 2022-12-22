package testingprograms;

import java.util.LinkedList;

public class LinkedList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> cars = new LinkedList<String>();
		
		cars.add("valvo");
		cars.add("verna");
		cars.add("skoda");
		cars.add("city");
		
		System.out.println(cars);
		
		cars.addFirst("hyundai");
		cars.addLast("accent");
        System.out.println(cars);
        
        
        cars.removeFirst();
        System.out.println(cars);
        
        cars.removeLast();
        System.out.println(cars);
        System.out.println(cars.getFirst());
        System.out.println(cars.getLast());
        



	}

}
