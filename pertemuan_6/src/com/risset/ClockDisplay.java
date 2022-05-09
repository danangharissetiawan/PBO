package com.risset;

public class ClockDisplay {
    private final NumberDisplay hours;
    private final NumberDisplay minutes;
    private String displayString;

    public ClockDisplay() {
        hours = new NumberDisplay(24);
        minutes = new NumberDisplay(60);
        updateDisplay();
    }

    public ClockDisplay(int hour, int minute) {
        hours = new NumberDisplay(hour);
        minutes = new NumberDisplay(minute);
        updateDisplay();
    }

    public void timeTick() {
        minutes.increment();
        if (minutes.getValue() == 0) {
            hours.increment();
        }
        updateDisplay();
    }

    public void setTime(int hour, int minute) {
        hours.setValue(hour);
        minutes.setValue(minute);
        updateDisplay();
    }

    public String getDisplayString() {
        return displayString;
    }

    private void updateDisplay() {
        displayString = hours.getDisplayValue() + ":" + minutes.getDisplayValue();
    }

}