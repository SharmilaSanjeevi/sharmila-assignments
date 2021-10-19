package com.shristi.basic;

import java.util.Scanner;

public class ArmStrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number : ");
		String number = scanner.next();

		int sum = 0;
		char[] charArr = number.toCharArray();

		int lengthOfNumber = (charArr.length);
		int n = Integer.parseInt(number);

		for (int i = 0; i < lengthOfNumber; i++) {

			int singleNumber = n % 10;

			// System.out.println(singleNumber);

			n = n / 10;

			int productOfNumber = 1;

			for (int j = 0; j < lengthOfNumber; j++) {
				productOfNumber = productOfNumber * singleNumber;
			}

			// System.out.println(productOfNumber);

			sum = sum + productOfNumber;
		}
		// System.out.println(sum);

		if (sum == Integer.parseInt(number)) {
			System.out.println("Armstrong Number ");

		} else {
			System.out.println("Not a Armstrong Number ");
		}

	}

}
