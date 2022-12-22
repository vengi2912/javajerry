package testingprograms;

import java.util.Scanner;

public class Palindromestring {

	public static void main(String[] args) {
		
		
		String x,y = "";		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Entre any string words to find palindrome");
		
		x= s.nextLine();
		
		int l=x.length();
	
		for (int k = l - 1; k >= 0; k--) {
			
			y=y+x.charAt(k);
			
		}
		if (x.equalsIgnoreCase(y)) {
			System.out.println(y + " " + "is palindorme");
		}else {
			System.out.println(y + " " + "is not palindorme");
		}
	}

}
