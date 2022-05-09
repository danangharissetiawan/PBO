package com.risset;

public class NumberDisplay {
    private int value;
    private final int displayLimit;

    public NumberDisplay(int displayLimit) {

        this.displayLimit = displayLimit;
        value = 0;
    }

    public void setValue(int value) {

        if (value >= 0 && value <= displayLimit) {
            this.value = value;
        }
    }

    public int getValue() {
        return value;
    }

    public void increment() {
        value++;
        if (value > displayLimit) {
            value = 0;
        }
    }

    public void decrement() {
        value--;
        if (value < 0) {
            value = displayLimit;
        }
    }

    public String toString() {
        return String.valueOf(value);
    }

    public String getDisplayValue() {
        if (value < 10) {
            return "0" + value;
        } else {
            return String.valueOf(value);
        }
    }
}
