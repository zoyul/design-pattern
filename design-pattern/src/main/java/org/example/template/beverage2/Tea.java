package org.example.template.beverage2;

public class Tea extends CaffeineBeverage {

    // 구체적인 음료 제조법 구현
    public void prepareRecipe() {
        boilWater();
        steepTeaBag();
        pourInCup();
        addLemon();
    }

    public void steepTeaBag() {
        System.out.println("홍차 우리기");
    }

    public void addLemon() {
        System.out.println("레몬 추가하기");
    }
}