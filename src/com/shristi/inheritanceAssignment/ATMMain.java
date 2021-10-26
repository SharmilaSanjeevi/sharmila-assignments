package com.shristi.inheritanceAssignment;

import java.util.Scanner;

public class ATMMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Account Type");
		System.out.println(" For Savings Account Press 1, For Current Account Press 2");
		System.out.println();
		String accountType = scanner.next();
		Bank bank;

		while (accountType.equals("1")) {
			
     	    bank = new Savings(300);
			System.out.println("Automated Teller Machine");
			System.out.println("Choose 1 for Withdraw");
			System.out.println("Choose 2 for Deposit");
			System.out.println("Choose 3 for Check Balance");
			System.out.println("Choose 4 for EXIT");
			System.out.print("Choose the operation you want to perform:");
			int n = scanner.nextInt();
			switch (n) {
			case 1:
				System.out.print("Enter money to be withdrawn:");
				int drawn = scanner.nextInt();
				bank.withdraw(drawn);

				break;

			case 2:
				System.out.print("Enter money to be deposited:");
				int dep = scanner.nextInt();
				bank.deposit(dep);

				
				break;

			case 3:
				System.out.println("Balance : " + bank.getBalance());

				break;

			case 4:
				System.exit(0);
			}
		}

		while (accountType.equals("2")) {
//        	 Bank bank = new Current(500);
			bank = new Current(500);

			System.out.println("Automated Teller Machine");
			System.out.println("Choose 1 for Withdraw");
			System.out.println("Choose 2 for Deposit");
			System.out.println("Choose 3 for Check Balance");
			System.out.println("Choose 4 for EXIT");
			System.out.print("Choose the operation you want to perform:");
			int n = scanner.nextInt();
			switch (n) {
			case 1:
				System.out.print("Enter money to be withdrawn:");
				int drawn = scanner.nextInt();
				bank.withdraw(drawn);

				break;

			case 2:
				System.out.print("Enter money to be deposited:");
				int dep = scanner.nextInt();
				bank.deposit(dep);

				
				break;

			case 3:
				System.out.println("Balance : " + bank.getBalance());

				break;

			case 4:
				System.exit(0);
			}
		}
		scanner.close();

	}

}
