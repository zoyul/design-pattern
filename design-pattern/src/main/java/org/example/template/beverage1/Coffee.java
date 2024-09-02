package org.example.template.beverage1;

public class Coffee {

    // 각 메소드마다 알고리즘의 단계를 구현
    void prepareRecipe() {
        boilWater();
        brewCoffeeGrinds();
        pourInCup();
        addSugarAndMilk();
    }

    public void boilWater() {
        System.out.println("물 끓이기");
    }

    public void brewCoffeeGrinds() {
        System.out.println("커피 우리기");
    }

    public void pourInCup() {
        System.out.println("컵에 따르기");
    }

    public void addSugarAndMilk() {
        System.out.println("설탕과 우유 추가하기");
    }
}
