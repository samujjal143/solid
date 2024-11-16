package org.example;

public class Circle implements Shape {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(getRadius(), 2);
    }

    @Override
    public double volume() {
        return 0;
    }

    /* We are forcing the circle to implement something it can't do, hence we are breaking
       the Interface Segregation Principle
     */
}
