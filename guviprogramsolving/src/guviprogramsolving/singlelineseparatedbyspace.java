package guviprogramsolving;

import java.util.Scanner;

public class singlelineseparatedbyspace {
	
		public static void main(String[] args) {
			
			String name;
			
			Scanner myname = new Scanner(System.in);
			System.out.println("Entre your name ?");
			name = myname.next();
			
			String[] splitwords = name.split("");
			
			System.out.println(splitwords.length);
			
			for (int i = 0; i < splitwords.length; i++) {
				System.out.print(splitwords[i]);
				if(i<splitwords.length-1) {
					System.out.print(",");
			}
			
			
			}
			
			}
	}

