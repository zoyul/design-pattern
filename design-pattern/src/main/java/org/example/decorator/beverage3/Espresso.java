package org.example.decorator.beverage3;

// 실제 음료 클래스
public class Espresso extends Beverage {

    public Espresso() {
        description = "에스프레소";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
