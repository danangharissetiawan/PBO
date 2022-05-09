package com.risset;

public class NumberDisplay {
    private int value;
    private int limit;

    public NumberDisplay(int limit) {
        this.limit = limit;
        value = 0;
    }

    public void increment() {
        value = (value + 1) % limit;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getDisplayValue() {
        return String.format("%02d", value);
    }

    public String toString() {
        return Integer.toString(value);
    }
}
