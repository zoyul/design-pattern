package org.example.decorator.beverage2;

public class DarkRoast extends Beverage {
    // getter 메서드를 사용하여 첨가물 비용을 더해준다.
    @Override
    public double cost() {
        return getMilk() + getSoy() + getMocha();
    }
}
