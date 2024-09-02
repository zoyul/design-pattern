package org.example.template.beverage2;

public class Coffee extends CaffeineBeverage {

    // 구체적인 음료 제조법 구현
    public void prepareRecipe() {
        boilWater();
        brewCoffeeGrinds();
        pourInCup();
        addSugarAndMilk();
    }

    public void brewCoffeeGrinds() {
        System.out.println("커피 우리기");
    }

    public void addSugarAndMilk() {
        System.out.println("설탕과 우유 추가하기");
    }
}