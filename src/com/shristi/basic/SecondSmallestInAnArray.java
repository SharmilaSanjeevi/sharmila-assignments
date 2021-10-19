package com.shristi.basic;

import java.util.Scanner;

public class SecondSmallestInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter no of elements you want in an array : ");
		int n = scanner.nextInt();
		int[] num = new int[n];
		System.out.println("Enter Values : ");
		for (int i = 0; i < num.length; i++) {
			num[i] = scanner.nextInt();
		}
		int b = 0;
		for (int j = 0; j < num.length; j++) {
			for (int k = j + 1; k < num.length; k++) {
				if (num[j] > num[k]) {
					if (num[j] > num[k]) {
						b = num[j];
						num[j] = num[k];
						b = num[k];
					}
				}
			}

		}
		System.out.println(num[1]);

	}

}
