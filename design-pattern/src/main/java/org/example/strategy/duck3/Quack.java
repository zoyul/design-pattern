package org.example.strategy.duck3;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("꽥꽥");
    }
}
