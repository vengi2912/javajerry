package javaencapsulation;

import java.util.Scanner;

public class Scannerclass {
	
	

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try (Scanner myObj = new Scanner(System.in)) {
			String userName;
			int age;
			long contact;
			
			
			System.out.println("Enter username"); 
			userName= myObj.nextLine();  
			 
			System.out.println("Username is: " + userName); 
			
			System.out.println("Enter age"); 
			age = myObj.nextInt();   
			
			   
			System.out.println("age is: " + age); 
			
			System.out.println("Enter mobilenumber"); 
			contact = myObj.nextLong();   
			   
			System.out.println("contact: " + contact);
		} 
	    
	    
		
		
	
		
	}
}
	
	
		
		

	


