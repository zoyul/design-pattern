package org.example.decorator.beverage5;

// 실제 음료 클래스
public class Espresso extends Beverage {

    public Espresso(Size size) {
        description = "에스프레소";
        this.size = size;
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
