package org.javaclass;

public class BikeSpeed {
	
	public void Fullthoratle() {
		
		System.out.println("the car is going to full speed");
	}
	
	public void maxspeed(int speed) {
		System.out.println("max speed is : " +  speed);
	}

	public static void main(String[] args) {
		
		BikeSpeed mybike = new BikeSpeed();
		mybike.Fullthoratle();
		mybike.maxspeed(200);
	
		

	}

}
