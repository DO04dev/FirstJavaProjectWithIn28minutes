package com.reinnovs.firstjavaproject;

public class MultiplicationTable {
	// 5*1 = 5
	// 5*10 = 50
	void print() {
		print(5);
	}

	void print(int table) {
		print(table, 1, 10);
	}

	void print(int table, int from, int to) {
		for (int y = from; y <= to; y++) {
			System.out.printf("%d * %d = %d", table, y, table * y).println();
		}
	}
}
