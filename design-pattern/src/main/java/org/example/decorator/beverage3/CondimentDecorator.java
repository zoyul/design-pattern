package org.example.decorator.beverage3;

// 첨가물을 나타내는 추상클래스
public abstract class CondimentDecorator extends Beverage {
    Beverage beverage;
    public abstract String getDescription();
}
