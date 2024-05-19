package org.example.strategy.duck2;

public class MallardDuck extends Duck implements Flyable, Quackable {
    @Override
    public void display() {
        System.out.println("Mallard duck");
    }

    @Override
    public void fly() {
        System.out.println("MallardDuck fly");
    }

    @Override
    public void quack() {
        System.out.println("MallardDuck quak");
    }
}
