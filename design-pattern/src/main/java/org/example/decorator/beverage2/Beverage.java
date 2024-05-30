package org.example.decorator.beverage2;

public abstract class Beverage {

    private String description;
    private double milk;
    private double soy;
    private double mocha;

    public String getDescription() {
        return description;
    }

    public abstract double cost();

    public double getMilk() {
        return milk;
    }

    public double getSoy() {
        return soy;
    }

    public double getMocha() {
        return mocha;
    }
}
