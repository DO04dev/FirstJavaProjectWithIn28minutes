package com.reinnovs.object_oriented_programming_introduction;

public class BookRunner {

	public static void main(String[] args) {
		Book artOfComputerProgramming = new Book();
		Book effectiveJava = new Book();
		Book cleanCode = new Book();

		System.out.println("Art of Programming Copies: " + artOfComputerProgramming.getNoOfCopies());
		System.out.println("Effective Java: " + effectiveJava.getNoOfCopies());
		System.out.println("Clean Code: " + cleanCode.getNoOfCopies());
		System.out.println();

		artOfComputerProgramming.setNoOfCopies(23);
		effectiveJava.setNoOfCopies(23);
		cleanCode.setNoOfCopies(22);
		System.out.println("Art of Programming set number of Copies: " + artOfComputerProgramming.getNoOfCopies());
		System.out.println("Effective Java set number of Copies: " + effectiveJava.getNoOfCopies());
		System.out.println("Clean Code set number of Copies: " + cleanCode.getNoOfCopies());
		System.out.println();

		artOfComputerProgramming.increaseNumCopies(23);
		effectiveJava.increaseNumCopies(24);
		cleanCode.increaseNumCopies(83);
		System.out.println("Art of Programming increase number of Copies: " + artOfComputerProgramming.getNoOfCopies());
		System.out.println("Effective Java increase number of Copies: " + effectiveJava.getNoOfCopies());
		System.out.println("Clean Code increase number of Copies: " + cleanCode.getNoOfCopies());
		System.out.println();

		artOfComputerProgramming.decreaseNumCopies(2);
		effectiveJava.decreaseNumCopies(23);
		cleanCode.decreaseNumCopies(42);
		System.out.println("Art of Programming decrease number of Copies: " + artOfComputerProgramming.getNoOfCopies());
		System.out.println("Effective Java decrease number of Copies: " + effectiveJava.getNoOfCopies());
		System.out.println("Clean Code decrease number of Copies: " + cleanCode.getNoOfCopies());
		System.out.println();

	}

}
