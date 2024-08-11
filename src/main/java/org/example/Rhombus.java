package org.example;

public class Rhombus {
    public double diagonal1;
    public double diagonal2;

    public Rhombus(double diagonal1, double diagonal2) {
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
    }

    public double Area()
    {
        return (diagonal1*diagonal2) / 2;
    }
}
