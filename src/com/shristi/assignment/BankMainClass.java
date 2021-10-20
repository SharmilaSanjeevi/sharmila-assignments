package com.shristi.assignment;

import java.util.Scanner;

public class BankMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Amount Deposit");
		Scanner scanner = new Scanner(System.in);
		double deposit = scanner.nextInt();

		Bank b = new Bank(deposit);

		double balance = b.getBalance();
		System.out.println("Balance = " + balance);

		scanner.close();

	}

}
