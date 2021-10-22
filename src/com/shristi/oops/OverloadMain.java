package com.shristi.oops;

import java.util.Scanner;

public class OverloadMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double basicAllowance = 30000;
		double carAllowance = 30000;
		double houseAllowance = 30000;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Name : ");
		String name = scanner.next();

		System.out.println("Designation : ");
		String designation = scanner.next();

		Employee Programmer = new Employee(name, designation);
		Employee Manager = new Employee(name, designation);
		Employee Director = new Employee(name, designation);

		if (designation.equals("Programmer")) {

			Double bonus = Programmer.calcBonus(basicAllowance);
			System.out.println(bonus);

		}

		if (designation.equals("Manager")) {

			Double bonus = Manager.calcBonus(basicAllowance);
			System.out.println(bonus);

		}

		if (designation.equals("Director")) {

			Double bonus = Director.calcBonus(basicAllowance);
			System.out.println(bonus);

		}

		scanner.close();

	}

}
