package com.shristi.assignment;

import java.util.Scanner;

public class SmallestOfThreeNumUsingShortCircuitAnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a, b, c, smallest;

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first number :");
		a = scanner.nextInt();
		System.out.println("Enter second number :");
		b = scanner.nextInt();
		System.out.println("Enter Third number :");
		c = scanner.nextInt();

		if (a < b && a < c) {
			smallest = a;
		} else if (b < c) {
			smallest = b;
		} else {
			smallest = c;
		}

		System.out.println(smallest + " is a smallest number");

		scanner.close();

	}

}
