package com.reinnovs.firstjavaproject;

public class MultiplicationTable {
	// 5*1 = 5
	// 5*10 = 50
	void print() {
		for (int x = 1; x <= 10; x++) {
			System.out.printf("%d * %d = %d", 5, x, 5 * x).println();
		}
	}

	void print(int table) {
		for (int y = 1; y <= 10; y++) {
			System.out.printf("%d * %d = %d", table, y, table * y).println();
		}
	}
	
	void print(int table, int from, int to) {
		for (int y = from; y <= to; y++) {
			System.out.printf("%d * %d = %d", table, y, table * y).println();
		}
	}
}
