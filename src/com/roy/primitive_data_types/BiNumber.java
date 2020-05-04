package com.roy.primitive_data_types;

public class BiNumber {
	private int firstNo;
	private int secondNo;

	public int getFirstNo() {
		return firstNo;
	}

	public void setFirstNo(int firstNo) {
		this.firstNo = firstNo;
	}

	public int getSecondNo() {
		return secondNo;
	}

	public void setSecondNo(int secondNo) {
		this.secondNo = secondNo;
	}

	BiNumber() {
	}

	public BiNumber(int num1, int num2) {
		this.firstNo = num1;
		this.secondNo = num2;
	}

	public int add() {
		return firstNo + secondNo;
	}

	public int multiply() {
		return firstNo * secondNo;
	}

	public void doubleNums() {
		this.firstNo *= 2;
		this.secondNo *= 2;
	}
}
