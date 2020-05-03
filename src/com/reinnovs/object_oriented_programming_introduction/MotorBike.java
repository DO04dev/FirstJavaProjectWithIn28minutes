package com.reinnovs.object_oriented_programming_introduction;

public class MotorBike {
	// State
	// Use of private - Encapsulation
	private int speed; // member variable

	// behaviour
	// Create a method of exposing the above speed
	void setSpeed(int speed) { // local variable

		// Print Local Variable
		System.out.println(speed);

		// Print Member Variable
		System.out.println(this.speed);

		this.speed = speed;
	}

	int getSpeed() {
		return this.speed;
	}

	void start() {
		System.out.println("Bike Started");
	}
}
