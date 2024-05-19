package org.example.strategy.duck1;

public class RubberDuck extends Duck {
    @Override
    public void display() {
        System.out.println("rubber duck");
    }
    // 고무 오리는 날 수 없으므로, 날 수 없도록 fly 메서드를 재정의 해준다.
    @Override
    public void fly() {
        System.out.println("rubber duck cannot fly");
    }
}
