package org.example;

public class Cube implements Shape, ThreeDimentionalShape {
    @Override
    public double area() {
        return 100;
    }

    @Override
    public double volume() {
        return 0;
    }
}
