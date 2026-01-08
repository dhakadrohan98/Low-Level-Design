package org.factorySolution;

public abstract class ShapeFactory {

    // Factory Method
    protected abstract Shape createShape();

    // Template method
    public void render() {
        //create shape of that object whose creator has called render() method
        Shape shape = createShape();
        //Circle.draw();
        shape.draw();
        System.out.println("Area: " + shape.area());
    }
}

