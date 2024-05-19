package org.example.strategy.duck4;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("날자");
    }
}
