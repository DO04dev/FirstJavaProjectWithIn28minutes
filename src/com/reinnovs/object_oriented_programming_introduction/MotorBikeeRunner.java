package com.reinnovs.object_oriented_programming_introduction;

public class MotorBikeeRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MotorBike ducati = new MotorBike(23);
		MotorBike honda = new MotorBike(52);

		ducati.start();
		honda.start();
		System.out.println();

		System.out.println("Ducati Speed: " + ducati.getSpeed());
		System.out.println("Honda Speed: " + ducati.getSpeed());
		System.out.println();

		ducati.setSpeed(23);
		honda.setSpeed(13);
		System.out.println("Ducati Set Speed: " + ducati.getSpeed());
		System.out.println("Honda Set Speed: " + honda.getSpeed());
		System.out.println();

		ducati.increaseSpeed(100);
		honda.increaseSpeed(100);
		System.out.println("Ducati Increase Speed: " + ducati.getSpeed());
		System.out.println("Honda Increase Speed: " + honda.getSpeed());
		System.out.println();

		ducati.decreaseSpeed(34);
		honda.decreaseSpeed(63);
		System.out.println("Ducati Decrease Speed: " + ducati.getSpeed());
		System.out.println("Honda Decrease Speed: " + honda.getSpeed());
		System.out.println();

	}

}
