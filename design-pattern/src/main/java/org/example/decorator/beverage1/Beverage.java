package org.example.decorator.beverage1;

public abstract class Beverage {

    private String description;

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
