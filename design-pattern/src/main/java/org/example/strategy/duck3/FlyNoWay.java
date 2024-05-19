package org.example.strategy.duck3;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("날 수 없어요");
    }
}
