package com.shristi.javainheritance;

public class Current extends Account {

    public Current(double balance) {
        super(balance);
        // TODO Auto-generated constructor stub
    }

    @Override
    void withdraw(int amount) {
        // TODO Auto-generated method stub
        try {
            if (amount > balance) {
                System.out.println("Low balance");
            } else {
                balance = balance - amount;
                System.out.println("Amount withdrawn: " + amount);
            }
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Override
    void deposit(int amount) {
        // TODO Auto-generated method stub

        System.out.println("Amount deposited: " + amount);
    }

}
