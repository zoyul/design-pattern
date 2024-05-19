package org.example.strategy.duck2;

public class RubberDuck extends Duck implements Quackable {
    @Override
    public void display() {
        System.out.println("rubber duck");
    }

    @Override
    public void quack() {
        System.out.println("rubber duck quack");
    }

    // 이 구현방법의 문제점은 코드중복이 매우 많다는 점. 꽥꽥거리는 기능을 바꾸고 싶다면 자식 클래스의 모든 quack 메서드를 바꿔주어야 한다.
}
