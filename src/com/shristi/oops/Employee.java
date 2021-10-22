package com.shristi.oops;

public class Employee {
	String name;
	String desgination;

	Employee(String name, String designation) {

		this.name = name;
		this.desgination = designation;

	}

	double calcBonus(double basicAllowance) {

		double Bonus = basicAllowance * 3;
		return basicAllowance;

	}

	double calcBonus(double basicAllowance, double carAllowance) {

		double Bonus = basicAllowance + carAllowance * (2);
		return carAllowance;

	}

	double calcBonus(double basicAllowance, double carAllowance, double houseAllowance) {

		double Bonus = basicAllowance + carAllowance + houseAllowance * (2);
		return houseAllowance;
	}

}
