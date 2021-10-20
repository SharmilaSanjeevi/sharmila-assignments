package com.shristi.basic;

public class PyramidRightAngleStars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i, j, n = 5;

		// outer loop to handle number of rows
		// n in this case

		for (i = 1; i <= n; i++) {

			// inner loop to handle number of columns
			// values changing according to outer loop
			for (j = 1; j <= i; j++) {

				// printing stars
				System.out.print("*");

			}

			// ending line after each row
			System.out.println(" ");
		}

	}

}
