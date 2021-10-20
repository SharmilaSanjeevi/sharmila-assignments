package com.shristi.assignment;

import java.util.Scanner;

public class SquareRootOfNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter Value");

		Scanner scanner = new Scanner(System.in);
		int length = scanner.nextInt();

		int[] Array = new int[length];

		System.out.println("Enter Values");

		for (int i = 0; i < length; i++) {

			Array[i] = scanner.nextInt();

		}

		for (int num : Array) {

			System.out.print(Math.sqrt(num));
		}

		scanner.close();

	}

}
