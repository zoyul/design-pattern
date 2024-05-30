package org.example.decorator.beverage3;

public class DarkRoast extends Beverage {

    public DarkRoast() {
        this.description = "다크로스트";
    }

    @Override
    public double cost() {
        return 1.59;
    }
}
