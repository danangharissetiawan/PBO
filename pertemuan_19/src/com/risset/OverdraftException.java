package com.risset;

public class OverdraftException extends Exception {

    private double amount;

    public OverdraftException(String msg, double amount) {
        super(msg);
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
}
