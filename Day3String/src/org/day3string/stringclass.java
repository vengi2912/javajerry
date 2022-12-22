package org.day3string;

public class stringclass {

	public static void main(String[] args) {
		
		String txt = "      haris     ";
		System.out.println( txt);
		System.out.println( txt.trim());
		
		String text = "Hello World";
		System.out.println(text.toUpperCase());   
		System.out.println(text.toLowerCase());   
		//index off
		String find = "Please locate where 'locate' occurs!";
		System.out.println(find.indexOf("where")); 
	

	}

}
