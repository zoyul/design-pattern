package org.example.decorator.beverage5;

public class TallSizeCost implements SizeCost {
    @Override
    public double cost() {
        return 0.1;
    }
}
