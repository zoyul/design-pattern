package org.example.factory.pizza5;

public abstract class Pizza {
    String name;
    // 피자에서 사용되는 원재료들
    Dough dough;
    Sauce sauce;
    Cheese cheese;
    Veggies veggies[];

    // 피자 만드는 메서드를 추상 메서드로 수정
    abstract void prepare();
}