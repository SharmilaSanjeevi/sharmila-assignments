package com.shristi.assignment;

public class GreatestOfThreeNumUsingTernaryOptr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 80, b = 50, c = 90, result, temp;

		// Scanner scanner = new Scanner(System.in);
		// System.out.println("Enter first number");
		// a=scanner.nextInt();
		// System.out.println("Enter Second Number");
		// b=scanner.nextInt();
		// System.out.println("Enter Third Number");
		// c=scanner.nextInt();
		// scanner.close();

		temp = a > b ? a : b;

		result = c > temp ? c : temp;

		System.out.println("Largest Numbre is " + result);

	}
}
