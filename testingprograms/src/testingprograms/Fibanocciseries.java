package testingprograms;

import java.util.Scanner;

public class Fibanocciseries {
	
		public static void main(String args[])
		{  
//		 int n1=0,n2=1,n3,i,count=10;  
//		 System.out.print(n1+" "+n2);//printing 0 and 1  
//		  
//		 for(i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed  
//		 {  
//		  n3=n1+n2;  
//		  System.out.print(" "+n3);  
//		  n1=n2;  
//		  n2=n3;  
//		 }  

//			int n1=0,n2=1,n3,i,count=10;    
//			 System.out.print(n1+" "+n2);//printing 0 and 1    
//			    
//			 for(i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed    
//			 {    
//			  n3=n1+n2;    
//			  System.out.print(" "+n3);    
//			  n1=n2;    
//			  n2=n3;    
//			 }    
//			
			
			
			int n1=0,n2=1,n3,i,count;
			
			Scanner count1=new Scanner(System.in);
			System.out.println("entre any number");
			
			count= count1.nextInt();
			
			System.out.print(n1+ " " +n2);
			
			for (i=2;i<count;i++) {
				n3=n1+n2;
				
				System.out.print(" "+ n3);
				
				n1=n2;
				n2=n3;
				
			}
			
			
			
		}}


