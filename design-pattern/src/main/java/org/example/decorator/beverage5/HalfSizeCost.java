package org.example.decorator.beverage5;

public class HalfSizeCost implements SizeCost {
    @Override
    public double cost() {
        return 0.05;
    }
}
