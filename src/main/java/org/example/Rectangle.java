package org.example;

public class Rectangle {
    public double length;
    public double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double Area() {
        return length*width;
    }
}
