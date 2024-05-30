package org.example.decorator.beverage5;

public class GrandeSizeCost implements SizeCost {
    @Override
    public double cost() {
        return 0.2;
    }
}
