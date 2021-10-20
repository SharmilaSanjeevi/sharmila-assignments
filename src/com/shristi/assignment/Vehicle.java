package com.shristi.assignment;

public class Vehicle {

	String name;
	String model;
	int price;

	Vehicle(String name, String model, int price) {

		this.name = name;
		this.model = model;
		this.price = price;

	}

	void getDetails() {

		System.out.println("Vehicle");
		System.out.println("Name :" + name);
		System.out.println("Model :" + model);
		System.out.println("Price :" + price);

	}

}
