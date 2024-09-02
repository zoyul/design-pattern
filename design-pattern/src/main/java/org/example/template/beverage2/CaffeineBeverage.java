package org.example.template.beverage2;

public abstract class CaffeineBeverage {

    public abstract void prepareRecipe();

    public void boilWater() {
        System.out.println("물 끓이기");
    }

    public void pourInCup() {
        System.out.println("컵에 따르기");
    }
}
