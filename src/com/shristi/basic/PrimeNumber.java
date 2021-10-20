package com.shristi.basic;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {

		int n, count = 0;

		System.out.println("Enter any Number : ");
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();

		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				count++;
			}
		}

		if (count == 2) {
			System.out.println(+n + "is a prime Number");

		} else {
			System.out.println(+n + " is not a prime Number");
		}

		scanner.close();

	}

}
