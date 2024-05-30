package org.example.decorator.beverage5;

public class Soy extends CondimentDecorator {

    SizeCost sizeCost;

    public Soy(Beverage beverage, SizeCost sizeCost) {
        this.beverage = beverage;
        this.sizeCost = sizeCost;
    }

    @Override
    public double cost() {
        return beverage.cost() + sizeCost.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", 두유";
    }

    @Override
    public Size getSize() {
        return beverage.getSize();
    }
}
