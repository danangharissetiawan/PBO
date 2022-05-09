package com.risset;

public class RectangularEncapDemo {
    public static void main(String[] args) {
        System.out.println("Before create Rectangle object");
        System.out.println("Total Object = " + RectangularEncap.getTotalObjects());

        // create rectangle object with width = 0 and length = 0
        RectangularEncap rect = new RectangularEncap(0, 0);
        System.out.println("Area of rectangle = " + rect.getLength() + " * " + rect.getWidth() + " = " + rect.getArea());
        System.out.println("Total Object = " + RectangularEncap.getTotalObjects());

        // create rectangle object with width = 7 and length = 6
        RectangularEncap rect1 = new RectangularEncap(6, 7);
        System.out.println("Area of rectangle = " + rect1.getLength() + " * " + rect1.getWidth() + " = " + rect1.getArea());
        System.out.println("Total Object = " + RectangularEncap.getTotalObjects());

        // crete rectangle object with width = 8 and length = 5
        RectangularEncap rect2 = new RectangularEncap(8, 5);
        System.out.println("Area of rectangle = " + rect2.getLength() + " * " + rect2.getWidth() + " = " + rect2.getArea());
        System.out.println("Total Object = " + RectangularEncap.getTotalObjects());


    }
}
