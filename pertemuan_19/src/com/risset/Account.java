package com.risset;

public class Account {
    protected double balance;

    protected Account(double initialBalance) {
        balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) throws OverdraftException {
        if (balance - amount < 0) {
            throw new OverdraftException("Insufficient funds", amount - balance);
        } else {
            balance -= amount;
        }
    }

    public static void main(String[] args) {
        int i;
        Account [] accounts = new Account[100];
        accounts[0] = new Account(2000000);
        accounts[1] = new Account(0);

        for (i = 0; i < 2; i++) {
            double b = accounts[i].getBalance();
            System.out.println("Account " + i + " has balance " + b);

            try {
                accounts[i].withdraw(1000000);
            } catch (OverdraftException e) {
                System.out.println("Account " + i + " has overdraft of " + e.getAmount());
                System.out.println("Unable to withdraw from account " + i);
            }
        }
    }
}
