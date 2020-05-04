package com.reinnovs.conditionals;

public class Menu {
	private int num1;
	private int num2;

	Menu() {
	}

	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

//	public int chosenMenu(int chosenOp) {
//		int choice = 0;
//		while (!(chosenOp >= 1 && chosenOp <= 4)) {
//			switch (chosenOp) {
//			case 1:
//				choice = num1 + num2;
//				break;
//			case 2:
//				choice = num1 - num2;
//				break;
//			case 3:
//				choice = num1 / num2;
//				break;
//			case 4:
//				choice = num1 * num2;
//				break;
//			}
//		}
//		return choice;
//	}
//
//	public void displayResults() {
//		// Display function
//	}
}
