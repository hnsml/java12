package org.example;

public class Triangle {
    public double base;
    public double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double Area() {
        return (base * height) / 2;
    }
}
