package org.javabasics.trainning;

public class day15 {
	
	//call a method 
	static void myMethod() {
	    System.out.println("I just got executed!");
	    
	    
	  }
	
	//Parameters and Arguments
	
	static void vmethod(String fname ) {
		
		System.out.println(fname + " " +"jerry");
	}
	
	static void gmethod(String gname , int age) {
		
		System.out.println(gname + " " +"age is" + " " + age);
	}
	
	static int smethod(int x ,int y) {
		return (5+x+y);
		
	}
	
	// if class 
	
  static void checkage(int age) {
	  if (age<18) {
		  
		System.out.println("you are not elliglbe for vote");
	  }else{
		  System.out.println("you are elliglbe");
	  }
  }
  
  

  
  
	

	public static void main(String[] args) {
		
//		myMethod();
//		myMethod();
//		
//		
//		vmethod("venkat");
//		vmethod("ram");
//		vmethod("srini");
//		
//		gmethod("gd", 29);
//		gmethod("solai",35);
		
		checkage(10);
		
	//	System.out.println(smethod(3,10));

	}

}
