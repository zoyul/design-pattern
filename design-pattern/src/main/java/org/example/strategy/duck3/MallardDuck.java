package org.example.strategy.duck3;

public class MallardDuck extends Duck {

    // MallardDuck이 만들어질 때, 생성자는 Quack(QuackBehavior를 구현한 클래스)를 인스턴스 변수에 넣음.
    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("저는 물오리입니다.");
    }
}
