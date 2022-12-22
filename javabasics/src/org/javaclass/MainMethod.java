package org.javaclass;

public class MainMethod  {
	public static void main(String[] args) {
		//Constructor
		System.out.println("Constructor");
		Constractor myCar = new Constractor(2019,"Hyundai verna");
		System.out.println(myCar.ModelName + " " + myCar.ModelYear);
		
		//JavaClassObject
		System.out.println("JavaClassObjects");
		JavaClassObject intx = new JavaClassObject();
		System.out.println(intx.x);
		System.out.println(intx.name);
		intx.y = 40;
		intx.x = 20;
		System.out.println(intx.y);
		System.out.println(intx.x);
		
		
		PublicVsStatic myobj = new PublicVsStatic();
		myobj.publicmethod();
		
	}

}
