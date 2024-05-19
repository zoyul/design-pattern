package org.example.strategy.duck3;

public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("삑삑");
    }
}
