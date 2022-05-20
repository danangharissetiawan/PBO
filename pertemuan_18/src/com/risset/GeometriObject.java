package com.risset;

public abstract class GeometriObject implements Benefits{
    private String color = "white";
    private boolean filled;
    private java.util.Date dateCreated;

    /**
     * Construct a default geometric object
     */
    public GeometriObject() {
        dateCreated = new java.util.Date();
    }

    /**
     * Construct a geometric object with color and filled value
     */
    public GeometriObject(String color, boolean filled) {
        dateCreated = new java.util.Date();
        this.color = color;
        this.filled = filled;
    }

    /**
     * Return color
     */
    public String getColor() {
        return color;
    }

    /**
     * Set a new color
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Return filled. Since filled is boolean,
     * the get method is named isFilled
     */
    public boolean isFilled() {
        return filled;
    }

    /**
     * Set a new filled
     */
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    /**
     * Get dateCreated
     */
    public java.util.Date getDateCreated() {
        return dateCreated;
    }

    /**
     * Return a string representation of this object
     */
    @Override
    public String toString() {
        return "created on " + dateCreated + "\ncolor: " + color +
                " and filled: " + filled;
    }

    /**
     * Abstract method getArea
     */
    public abstract double getArea();

    /**
     * Abstract method getPerimeter
     */
    public abstract double getPerimeter();

    @Override
    public void application(){
        System.out.println("Application for " + this.getClass().getSimpleName() + " is running");
    }

}
