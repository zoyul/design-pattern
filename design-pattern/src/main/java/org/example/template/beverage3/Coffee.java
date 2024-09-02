package org.example.template.beverage3;

public class Coffee extends CaffeineBeverage {

    @Override
    void brew() {
        System.out.println("커피 우리기");
    }

    @Override
    void addCondiments() {
        System.out.println("설탕과 우유 추가하기");
    }
}