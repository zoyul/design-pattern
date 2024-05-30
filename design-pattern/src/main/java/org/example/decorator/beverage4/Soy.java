package org.example.decorator.beverage4;

public class Soy extends CondimentDecorator {

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    // 사이즈에 따라 가격을 다르게 책정한다
    @Override
    public double cost() {
        double cost = beverage.cost();
        if (beverage.getSize() == Size.TALL) {
            cost += .10;
        } else if (beverage.getSize() == Size.GRANDE) {
            cost += .20;
        } else if (beverage.getSize() == Size.VENTI) {
            cost += .30;
        }
        return cost;
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
