package com.reinnovs.object_oriented_programming_introduction;

public class MotorBike {
	// State - Member Variables
	private int speed;

	MotorBike() {
	} // Default Constructor

	MotorBike(int speed) {
		this.speed = speed;
	}

	void setSpeed(int speed) {
		if (speed > 0)
			this.speed = speed;
	}

	int getSpeed() {
		return this.speed;
	}

	public void increaseSpeed(int howMuch) {
		setSpeed(this.speed += howMuch);
	}

	public void decreaseSpeed(int howMuch) {
		setSpeed(this.speed = howMuch);
	}

	void start() {
		System.out.println("Bike Started");
	}
}
