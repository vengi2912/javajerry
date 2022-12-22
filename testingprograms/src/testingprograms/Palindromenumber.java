package testingprograms;

import java.util.Scanner;

public class Palindromenumber {

	public static void main(String[] args) {
	
		
//		int r,sum=0,temp;
//		
//		int n=121;
//		temp=n;
//		
//		while(n>0) {
//			
//			r = n%10;  //remainder
//			
//			sum = sum*10+r;
//			
//			n=n/10;
//			
//		}
//		if (temp==sum) {
//			System.out.println(temp  + " " + "is palindrome");
//		}else {
//			System.out.println(temp  + " " + "is not palindorme");
//		}
		
		int x,y=0,temp=0,number;
		
		Scanner s= new Scanner(System.in);
		
		System.out.println("entre number");
		number=s.nextInt();
		x=number;
		
		y=x;
		
		
		while (number>0) {
			x= number%10;
			
			number = number/10;
			
			temp = temp*10 + x;
		}
		if (temp==y) {
			
			System.out.println(temp + "is palindrome");
		}else {
			System.out.println(temp + "is not palindrome");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
