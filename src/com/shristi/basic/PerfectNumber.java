package com.shristi.basic;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n, sum = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Value : ");
		n = scanner.nextInt();
		for (int i = 1; i < n; i++) {
			if (n % i == 0) {
				sum = sum + i;     // or sum+ = i;
			}
		}
		if (sum == n) {
			System.out.println(+ n + " is a Perfect Number");
		} else {
			System.out.println(+ n + " is Not a Perfect Number");
		}

	}

}
