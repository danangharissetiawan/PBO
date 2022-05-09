package com.risset;

public class MountainBike extends Bicycle {

    int setHeight;

    public void setHeight(int newValue) {
        setHeight = newValue;
        System.out.println("Seat Height: " + setHeight);
    }

    public static void main(String[] args) {
        MountainBike myBike = new MountainBike();
        myBike.setHeight(20);
        myBike.changeGear(3);
        myBike.speedUp(10);

    }
}
