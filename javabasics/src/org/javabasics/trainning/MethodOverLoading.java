package org.javabasics.trainning;

public class MethodOverLoading {
	
	
	static int plusintmethod(int x , int y) {
		return(x+y);
	}
	
	static double plusdoublemethod (double x ,double y) {
		return(x+y);
	}

	public static void main(String[] args) {
		
		
		int myNum = plusintmethod(8,5);
		
		double mydouble = plusdoublemethod(7.5 , 8.7);
		
		System.out.println(myNum);
		System.out.println(mydouble);
		
		 
		
		

	}

}
