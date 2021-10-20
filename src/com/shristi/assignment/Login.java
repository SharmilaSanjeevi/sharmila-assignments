package com.shristi.assignment;

import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] names = new String[] { "Ram", "Janu", "Tom", "Jerry", "ChottaBeam" };

		System.out.println("Enter UserName to Login : ");

		Scanner scanner = new Scanner(System.in);
		String username = scanner.next();

		int count = 0;

		for (String n : names) {
			if (username.equals(n)) {
				count = 1;
			}
		}

		if (count == 1) {
			System.out.println("You are logged in successfully");
		} else {
			System.out.println("Invalid username");
		}

		scanner.close();

	}

}
