package org.factorySolution;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing Rectangle");
    }

    @Override
    public double area() {
        return 4 * 6;
    }
}

