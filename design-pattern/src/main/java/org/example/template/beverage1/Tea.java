package org.example.template.beverage1;

public class Tea {

    // 각 메소드마다 알고리즘의 단계를 구현
    void prepareRecipe() {
        boilWater();
        steepTeaBag();
        pourInCup();
        addLemon();
    }

    public void boilWater() {
        System.out.println("물 끓이기");
    }

    public void steepTeaBag() {
        System.out.println("홍차 우리기");
    }

    public void pourInCup() {
        System.out.println("컵에 따르기");
    }

    public void addLemon() {
        System.out.println("레몬 추가하기");
    }
}
