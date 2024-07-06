package org.example.factory.pizza4;

public class NYCheesePizza extends Pizza {
    public NYCheesePizza() {
        name = "뉴욕 스타일 소스와 치즈피자";
        dough = "뉴욕 스타일 도우";
        sauce = "뉴욕 스타일 소스";

        toppings.add("뉴욕 스타일 치즈");
    }

    public void cut() {
        System.out.println("뉴욕 스타일로 자르기");
    }
}
