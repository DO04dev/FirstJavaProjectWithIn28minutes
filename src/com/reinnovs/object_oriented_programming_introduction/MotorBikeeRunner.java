package com.reinnovs.object_oriented_programming_introduction;

public class MotorBikeeRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MotorBike ducati = new MotorBike();
		MotorBike honda = new MotorBike();

		ducati.start();
		honda.start();

		ducati.setSpeed(100);
		honda.setSpeed(80);

		ducati.setSpeed(20);
		honda.setSpeed(0);
	}

}
