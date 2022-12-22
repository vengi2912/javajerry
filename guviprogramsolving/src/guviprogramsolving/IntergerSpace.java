package guviprogramsolving;

import java.util.Scanner;

public class IntergerSpace {
	
	

	public static void main(String[] args) {
		String number;
		String number2;
		int num1[] = new int[10];
		Scanner num = new Scanner(System.in);
		System.out.println("Entre the number:");
		
		
		for (int i = 0; i < 3; i++) {
			
		
		number = num.nextLine();
		
		
		String[] parts =number.split(" ");
		
		for (int i1 = 0; i1 < parts.length; i1++) {
			
			num1[i1] = Integer.parseInt(parts[i1]);
			System.out.print(num1[i1] + " ");
			
			
			
		}
		
		
		}
		

	}

}
