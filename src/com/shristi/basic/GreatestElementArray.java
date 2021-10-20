package com.shristi.basic;

import java.util.Scanner;

public class GreatestElementArray {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter no of elements you want in an array : ");
		int n = scanner.nextInt();

		// Initialize array
		int[] arr = new int[n];

		System.out.println("Enter values : ");

		// Loop through the array
		for (int i = 0; i < arr.length; i++) {

			// Compare elements of array with max
			arr[i] = scanner.nextInt();
		}

		int max = arr[0];

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > max) {
				max = arr[i];
			}
		}

		System.out.println("Largest element  in an array: " + max);

		scanner.close();

	}

}
