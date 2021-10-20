package com.shristi.assignment;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Student Details");

		Scanner scanner = new Scanner(System.in);

		String n = scanner.next();
		int id = scanner.nextInt();

		System.out.println("Enter no of Subjects ");

		int count = scanner.nextInt();
		int[] Marks = new int[count];

		System.out.println("Enter Subjects Marks of Student");

		for (int i = 0; i < count; i++) {

			Marks[i] = scanner.nextInt();

		}

		System.out.println("Student2 Details");

		String n1 = scanner.next();
		int id1 = scanner.nextInt();

		System.out.println("Enter no of Subjects ");

		int count1 = scanner.nextInt();
		int[] Marks1 = new int[count];

		System.out.println("Enter Subjects Marks of Student");

		for (int i = 0; i < count1; i++) {

			Marks1[i] = scanner.nextInt();
		}

		Student s1 = new Student(n, id);
		s1.getDetails();
		s1.getGrades(Marks);

		Student s2 = new Student(n1, id1);
		s2.getDetails();
		s2.getGrades(Marks1);

		scanner.close();
	}

}
