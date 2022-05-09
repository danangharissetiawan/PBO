package com.risset;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello World!");

        ClockDisplay cd = new ClockDisplay();
        System.out.println(cd.getDisplayString());
        cd.setTime(11, 56);
        System.out.println("After setTime  = "+cd.getDisplayString());
        cd.timeTick();
        System.out.println("After timeTick = "+cd.getDisplayString());

        ClockDisplay cd1 = new ClockDisplay(12, 60);
        System.out.println(cd1.getDisplayString());
        cd1.setTime(11, 59);
        System.out.println("After setTime     = "+cd1.getDisplayString());
        cd1.timeTick();
        System.out.println("After timeTick #1 = "+cd1.getDisplayString());
        cd1.timeTick();
        System.out.println("After timeTick #2 = "+cd1.getDisplayString());

    }
}
