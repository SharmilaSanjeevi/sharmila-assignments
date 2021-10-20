package com.shristi.basic;

public class EvenNumbers {

	public static void main(String[] args) {

		int n = 20;

		System.out.println("Even Numbers  0 upto " + n + " are: ");

		for (int i = 0; i <= n; i++) {

			// if number%2 == 0 it means its an even number

			if (i % 2 == 0) {
				System.out.println(i + " ");
			}
		}

	}

}
