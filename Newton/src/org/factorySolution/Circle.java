package org.factorySolution;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing Circle");
    }

    @Override
    public double area() {
        return Math.PI * 5 * 5;
    }
}

