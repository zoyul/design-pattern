package org.example.decorator.beverage5;

// 음료 객체 만들기
public abstract class Beverage {
    String description = "";
    // 음료마다 사이즈를 설정할 수 있다
    Size size = Size.TALL;

    public Size getSize() {
        return this.size;
    }

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}