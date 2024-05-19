package org.example.strategy.duck3;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("날자");
    }
}
