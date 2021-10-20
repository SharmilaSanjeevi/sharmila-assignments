package com.shristi.basic;

import java.util.Scanner;

public class ReverseNumberInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter number of elements in the array:");
		int num = scanner.nextInt();

		int[] arr = new int[num];
		System.out.println("Enter " + num + " elements ");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}

		System.out.println("Array in reverse order: ");

		// Loop through the array in reverse order
		for (int j = 1; j < arr.length + 1; j++) {
			int k = num - j;
			System.out.print(arr[k] + " ");
		}

		scanner.close();

	}

}
