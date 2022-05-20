package com.risset;

public class Main {

    public static void main(String[] args) {
	GeometriObject geoObj1 = new Circle(5);
    GeometriObject geoObj2 = new Rectangle(5, 3);

    System.out.println("The two objects have the same area? " + equalArea(geoObj1, geoObj2));

    displayGeometricObject(geoObj1);

    displayGeometricObject(geoObj2);

    System.out.println();

    Square s = new Square();
    s.application();


    }

    private static void displayGeometricObject(GeometriObject object) {
        System.out.println();
        System.out.println("The area is " + object.getArea());
        System.out.println("The perimeter is " + object.getPerimeter());
    }

    private static String equalArea(GeometriObject geoObj1, GeometriObject geoObj2) {
        return geoObj1.getArea() == geoObj2.getArea() ? "yes" : "no";
    }


}
