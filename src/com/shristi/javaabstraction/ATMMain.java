package com.shristi.javaabstraction;



import java.util.Scanner;

public class ATMMain {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the account type ");
        System.out.println(" Savings Account press 1 , Current Account press 2 ");
        String AccountType = scanner.next();


        while (AccountType.equals("1")) {

            Savings bank = new Savings(40000);
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
                    int withdraw = scanner.nextInt();
                    bank.withdraw(withdraw);
                    break;

                case 2:
                    System.out.print("Enter money to be deposited:");
                    int depositAmount = scanner.nextInt();
                    bank.deposit(depositAmount);
                    break;

                case 3:
                    System.out.println("Balance : "+ bank.getBalance());

                    System.out.println("");
                    break;

                case 4:
                    System.exit(0);
            }
        }

        while (AccountType.equals("2")) {

            Current bank = new Current(200);
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
                    int withdraw = scanner.nextInt();
                    bank.withdraw(withdraw);
                    break;

                case 2:
                    System.out.print("Enter money to be deposited:");
                    int deposit = scanner.nextInt();
                    bank.deposit(deposit);
                    break;

                case 3:
                    System.out.println("Balance : "+ bank.getBalance());
                    System.out.println("");
                    break;

                case 4:
                    System.exit(0);

            }

        }
    }
}
