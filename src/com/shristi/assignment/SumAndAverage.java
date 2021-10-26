package com.shristi.assignment;

import java.util.Scanner;

public class SumAndAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n, sum = 0;
		float avg;

		Scanner scanner = new Scanner(System.in);
		System.out.println(" Enter no of elements you want : ");
		n = scanner.nextInt();

		int a[] = new int[n];

		System.out.println("Enter Values : ");

		for (int i = 0; i < n; i++) {
			a[i] = scanner.nextInt();
			sum = sum + a[i];
		}

		System.out.println("Sum = " + sum);

		avg = sum / n;
		System.out.println("Average = " + avg);

		scanner.close();

	}

}
