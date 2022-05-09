package com.risset;

public class RectangularEncap {
    private int length;
    private int width;
    private static int totalObjects = 0;

    public RectangularEncap() {
        totalObjects++;
    }

    public RectangularEncap(int length, int width) {
        this.length = length;
        this.width = width;

        totalObjects++;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getArea() {
        return length * width;
    }

    public int getPerimeter() {
        return 2 * (length + width);
    }

    public static int getTotalObjects() {
        return totalObjects;
    }
}


