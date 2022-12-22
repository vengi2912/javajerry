package testingprograms;

import java.util.HashSet;

public class HashsetNumber {

	public static void main(String[] args) {
		
		
		HashSet<Integer> numbers = new HashSet<Integer>();
		
		numbers.add(8);
		numbers.add(17);
		numbers.add(5);
		numbers.add(10);
		numbers.add(14);
		
		for (int i=0; i<=10; i++) {
			if (numbers.contains(i)) {
				System.out.println(i + " in this list ");
				}else {
					System.out.println(i + "not in the list");
				}
}}}