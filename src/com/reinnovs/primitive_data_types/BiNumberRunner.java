package com.reinnovs.primitive_data_types;

public class BiNumberRunner {

	public static void main(String[] args) {
		BiNumber numbers = new BiNumber(2, 3);
		System.out.println("Addition: " + numbers.add());
		System.out.println("Multiplication" + numbers.multiply());
		numbers.doubleNums();
		System.out.println("Addion Results: " + numbers.getFirstNo());
		System.out.println("Multiplication Results: " + numbers.getSecondNo());
	}

}
