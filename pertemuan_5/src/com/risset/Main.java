package com.risset;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Rectangular c1 = new Rectangular(2,3);
        Rectangular c2 = new Rectangular(4,5);
        System.out.println("Area of c1: " + c1.getArea() + "\nPerimeter of c1: " + c1.getPerimeter());
        System.out.println("Area of c2: " + c2.getArea() + "\nPerimeter of c2: " + c2.getPerimeter());
    }
}
