package org.example.decorator.beverage5;

public class VentiSizeCost implements SizeCost {
    @Override
    public double cost() {
        return 0.3;
    }
}
