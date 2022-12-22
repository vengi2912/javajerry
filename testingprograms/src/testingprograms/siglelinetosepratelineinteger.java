package testingprograms;


import java.util.Scanner;

public class siglelinetosepratelineinteger {

	public static void main(String[] args) {
		
		String name;
		
		Scanner myname = new Scanner(System.in);
		
		name = myname.next();
		
		String[] splitwords = name.split("");
		
		for (int i = 0; i < splitwords.length; i++) {
			System.out.print(splitwords[i]);
			if(i<splitwords.length-1) {
				System.out.print(",");
		}
		
		
		}
		System.out.println(splitwords[0]);
		}
}