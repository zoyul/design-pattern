package org.example.decorator.beverage4;

public class Mocha extends CondimentDecorator {

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    // 음료에 첨가물을 추가할 때의 가격
    @Override
    public double cost() {
        return beverage.cost() + .20;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", 모카";
    }

    @Override
    public Size getSize() {
        return beverage.getSize();
    }

}
