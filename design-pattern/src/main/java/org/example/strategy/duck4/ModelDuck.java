package org.example.strategy.duck4;

public class ModelDuck extends Duck {

    // MallardDuck이 만들어질 때, 생성자는 Quack(QuackBehavior를 구현한 클래스)를 인스턴스 변수에 넣음.
    public ModelDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyNoWay();
    }

    @Override
    public void display() {
        System.out.println("저는 모형 오리입니다.");
    }
}
