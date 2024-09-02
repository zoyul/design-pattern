package org.example.template.beverage3;

public class Tea extends CaffeineBeverage {

    @Override
    void brew() {
        System.out.println("홍차 우리기");
    }

    @Override
    void addCondiments() {
        System.out.println("레몬 추가하기");
    }
}