package com.shristi.basic;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n, firstNum = 0, secNum = 1;
		System.out.println(" Fibonacci Series : ");

		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.print(firstNum + " ");

			/*
			 * On each iteration, we are assigning second number to the first number and
			 * assigning the sum of last two numbers to the second number
			 */

			int SumOfPrevTwo = firstNum + secNum;

			firstNum = secNum;
			secNum = SumOfPrevTwo;
		}

		scanner.close();

	}

}
