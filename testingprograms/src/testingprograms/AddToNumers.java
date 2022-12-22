package testingprograms;

import java.util.Scanner;

public class AddToNumers {
	
	

	public static void main(String[] args) {
		int x,y, sum;
		
		Scanner mysum = new Scanner(System.in);
		
		System.out.println("Entre fist number");
		
	x =	mysum.nextInt();
	
	System.out.println("Entre Second number");
	
	y= mysum.nextInt();
		
	sum = x+y;
	
	System.out.println("sum of "+ x + "+" + y + " is = "+ sum);
	
	
		

	}

}
