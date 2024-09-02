package org.example.template.beverage3;

public abstract class CaffeineBeverage {

    // 서브클래스가 정해진 알고리즘을 벗어나지 못하게 final로 선언
    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    // 서브클래스에서 두 메소드를 다르게 처리하므로 추상 메서드로 선언하여 서브 클래스에서 구현하도록 함
    abstract void brew();
    abstract void addCondiments();

    public void boilWater() {
        System.out.println("물 끓이기");
    }

    public void pourInCup() {
        System.out.println("컵에 따르기");
    }
}