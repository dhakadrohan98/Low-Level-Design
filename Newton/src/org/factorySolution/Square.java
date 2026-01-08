package org.factorySolution;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing Square");
    }

    @Override
    public double area() {
        return 4 * 4;
    }
}

