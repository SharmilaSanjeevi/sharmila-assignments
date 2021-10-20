package com.shristi.assignment;

import java.util.Scanner;

public class Student {

	String name;
	int studentId;

	public Student(String name, int studentId) {
		this.name = name;
		this.studentId = studentId;

	}

	Scanner scanner = new Scanner(System.in);

	void getDetails() {
		
		System.out.println("Name : " + name);
		System.out.println("StudentId : " + studentId);
	}

	void getGrades(int[] marks) {
		
		int total = 0;
		float avg;

		for (int m : marks) {

			total = total + m;
		}

		System.out.println("Total : " + total);

		avg = total / 5;

		System.out.println("Average : " + avg);
		System.out.println("The student Grade is:");

		if (avg >= 70) {
			System.out.print("A");
		} else if (avg >= 40 && avg < 60) {
			System.out.print("B");
		}

		else {
			System.out.print("C");
		}

	}

}
