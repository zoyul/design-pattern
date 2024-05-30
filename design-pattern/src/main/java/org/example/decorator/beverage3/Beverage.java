package org.example.decorator.beverage3;

// 음료 객체 만들기
public abstract class Beverage {
    String description = "";


    public String getDescription() {
        return description;
    }

    public abstract double cost();
}