package com.reinnovs.object_oriented_programming_introduction;

public class Book {
	private int noOfCopies;

	Book() {
	}//

	public Book(int noOfCopies) {
		this.noOfCopies = noOfCopies;
	}

	void setNoOfCopies(int numCopies) {
		if (numCopies > 0)
			this.noOfCopies = numCopies;
	}

	int getNoOfCopies() {
		return this.noOfCopies;
	}

	public void increaseNumCopies(int howMuch) {
		this.noOfCopies += howMuch;
	}

	public void decreaseNumCopies(int howMuch) {
		this.noOfCopies -= howMuch;
	}
}
