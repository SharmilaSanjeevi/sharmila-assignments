package com.shristi.basic;

public class PatternNumberTriangle {

	public static void main(String[] args) {

		int i, j, n = 4, k = 1;

		System.out.println("Input number of rows : ");

		for (i = 1; i <= n; i++) {
			for (j = 1; j <= i; j++) {
				System.out.print(k++);
			}
			System.out.println(" ");
		}
	}

}
