package org.example;

import java.util.List;

public class AreaCalculator {
    public int sum(List<Object> shapes) {
        int sum = 0;
        for (int i = 0; i < shapes.size(); i++) {
            Object shape = shapes.get(i);
            if (shape instanceof Square) {
                sum += Math.pow(((Square) shape).getLength(), 2);
            } else if (shape instanceof Circle) {
                sum += Math.PI * Math.pow(((Circle) shape).getRadius(), 2);
            } else if (shape instanceof Cube) {

            }
            /* Open Closed Principle is violated because we are modifying an existing class
               each time we are having a new shape. If we have 10 extra shapes, we'll have a
               bunch of if-else statement
             */
        }
        return sum;
    }
}
