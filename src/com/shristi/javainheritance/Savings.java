package com.shristi.javainheritance;

public class Savings extends Account{

    public Savings(double balance) {
        super(balance);
        // TODO Auto-generated constructor stub
    }

    @Override
    void withdraw(int amount) {
        // TODO Auto-generated method stub
        if (amount > balance) {
            System.out.println("Low balance");
        } else {
            balance = balance - amount;
            System.out.println("Withdrawn amount: " + amount);

        }
    }

    @Override
    void deposit(int amount) {
        // TODO Auto-generated method stub
        System.out.println("Savings deposit " + amount);
    }

}
