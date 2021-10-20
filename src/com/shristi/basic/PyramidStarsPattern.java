package com.shristi.basic;

public class PyramidStarsPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i, j, n = 5;

		// inner loop
		for (i = n - 1; i >= 0; i--) {

			// outer loop
			for (j = 0; j <= i; j++) {

				// printing star and space
				System.out.print("* ");
			}

			// throws the cursor in the next line after printing each line
			System.out.println();
		}

	}

}
