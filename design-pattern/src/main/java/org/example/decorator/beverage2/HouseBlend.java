package org.example.decorator.beverage2;

public class HouseBlend extends Beverage {
    @Override
    public double cost() {
        return getMilk() + getSoy();
    }
}
