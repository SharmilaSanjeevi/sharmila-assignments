package com.shristi.assignment;

import java.util.Scanner;

public class Registration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] names = new String[] { "Ram", "Janu", "Tom", "Jerry", "ChottaBeam" };

		System.out.println("Enter name to register : ");

		Scanner scanner = new Scanner(System.in);
		String username = scanner.next();

		int count = 0;

		for (String n : names) {
			if (username.equals(n)) {
				count = 1;
			}
		}

		if (count == 1) {
			System.out.println("Name is not unique");
		} else {
			System.out.println("You are registered");
		}

		scanner.close();

	}

}
