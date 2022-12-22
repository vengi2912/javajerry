package javaencapsulation;
import java.util.Scanner;

public class cgpacalculation {
	
	
	
	
		public static void main(String[] args)
		{
				Scanner sc = new Scanner(System.in);
				
				String name = sc.nextLine();
				System.out.println("Entre you name?");
				System.out.println("Entre you gendre?");
				char gender = sc.next().charAt(0);
				System.out.println("Entre you age?");
				int age = sc.nextInt();
				System.out.println("Entre you contactnum?");
				long mobileNo = sc.nextLong();
				System.out.println("Entre you cgpa?");
				double cgpa = sc.nextDouble();
				System.out.println("Name: "+name);
				System.out.println("Gender: "+gender);
				System.out.println("Age: "+age);
				System.out.println("Mobile Number: "+mobileNo);
				System.out.println("CGPA: "+cgpa);
			}
		
	}



