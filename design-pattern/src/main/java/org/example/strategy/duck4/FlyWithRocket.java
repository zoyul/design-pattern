package org.example.strategy.duck4;

public class FlyWithRocket implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("로켓 추진력으로 날자");
    }
}
