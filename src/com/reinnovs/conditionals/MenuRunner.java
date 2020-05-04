package com.reinnovs.conditionals;

import java.util.Scanner;

public class MenuRunner {

	public static void main(String[] args) {
		// Scanner - Java inBuilt Class
		Scanner scanner = new Scanner(System.in);
		Menu menu = new Menu();

		System.out.println("Please Enter Num1: ");
		int num1 = scanner.nextInt();

		System.out.println("Please Enter Num2: ");
		int num2 = scanner.nextInt();

		System.out.println("The numbers you have entered are : " + num1 + " and " + num2);

		System.out.println("Please Choose Your Operation from the Menu Below: ");
		System.out.println("1 - Add ");
		System.out.println("2 - Subtract ");
		System.out.println("3 - Divide ");
		System.out.println("4 - Multiply ");
		int chosenOperation = scanner.nextInt();
		int res = 0;

		do {

			if (chosenOperation == 1) {
				res = num1 + num2;
			} else if (chosenOperation == 2) {
				res = num1 - num2;
			} else if (chosenOperation == 3) {
				do {
					if (num2 > 0) {
						res = num1 / num2;
					} else {
						System.out.println("Denominator cannot be zero!");
					}
				} while (num2 == 0);
			} else if (chosenOperation == 4) {
				res = num1 * num2;
			} else {
				System.out.println("Wrong Input!");
			}
		} while (chosenOperation > 4);

		System.out.println();
		System.out.print("Chosen Operation is: " + chosenOperation);

		System.out.println();
		System.out.print("Result is: " + res);
	}

}
