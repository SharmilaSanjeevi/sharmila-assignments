package com.shristi.basic;

public class OddNumbers {

	public static void main(String[] args) {

		int n = 20;
		System.out.println("Odd Numbers  1 upto " + n + " are :");
		for (int i = 0; i < n; i++) {
			if (i % 2 == 1) {
				
				// if number%2 == 1 it means its an odd number
				System.out.println(i + " ");
			}
		}

	}

}
