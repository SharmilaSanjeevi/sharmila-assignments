package com.shristi.basic;

import java.util.Arrays;
import java.util.Scanner;

public class CountDuplicatesInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter the length of the array : ");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		System.out.println("Enter the values in an array : ");
		int arr[] = new int[n];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();

		}

		Arrays.sort(arr);

		for (int i = 0; i < arr.length - 1; i++) {
			int count = 1;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
				} else
					break;
			}
			if (count > 1) {
				System.out.println(arr[i] + " --->" + count);
				i = i + count - 1;
			}
		}
	}

}
