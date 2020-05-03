package com.reinnovs.object_oriented_programming_introduction;

public class BookRunner {

	public static void main(String[] args) {
		Book artOfComputerProgramming = new Book();
		Book effectiveJava = new Book();
		Book cleanCode = new Book();

		artOfComputerProgramming.setNoOfCopies(42);
		artOfComputerProgramming.getNoOfCopies();

		effectiveJava.setNoOfCopies(32);
		effectiveJava.getNoOfCopies();

		cleanCode.setNoOfCopies(24);
		cleanCode.getNoOfCopies();

	}

}
