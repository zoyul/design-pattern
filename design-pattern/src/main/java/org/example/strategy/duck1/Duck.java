package org.example.strategy.duck1;

public abstract class Duck {
    public void quack() {
        System.out.println("꽥꽥");
    }
    public void swim() {
        System.out.println("수영하기");
    }
    public abstract void display();
    public void fly() {
        System.out.println("날다");
    }

    // 이렇게 구현할 경우 Duck 클래스에 메서드를 추가할 때마다 자식 클래스에 영향이 가게 됨.
}
