package org.example.strategy.duck4;

public abstract class Duck {
    QuackBehavior quackBehavior;
    FlyBehavior flyBehavior;

    // 꽥꽥거리는 행동을 직접 처리하는 대신, quackBehavior로 참조되는 객체에 그 행동을 위임함.
    public void performQuack() {
        quackBehavior.quack();
    }

    public void performFly() {
        flyBehavior.fly();
    }

    public abstract void display();

    // 오리의 행동 형식을 동적으로 지정하도록 setter 메서드 추가
    public void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }
}
