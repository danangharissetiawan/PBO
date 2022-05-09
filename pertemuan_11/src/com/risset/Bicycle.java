package com.risset;

public class Bicycle {
    int speed = 0;
    int gear = 0;

    void changeGear(int newValue) {
        gear += newValue;
        System.out.println("Gear = " + gear);
    }

    void speedUp(int increment) {
        speed += increment;
        System.out.println("Speed = " + speed);
    }


}
