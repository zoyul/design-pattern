package org.example.factory.pizza4;

public class ChicagoCheesePizza extends Pizza {
    public ChicagoCheesePizza() {
        name = "시카고 스타일 소스와 치즈피자";
        dough = "시카고 스타일 도우";
        sauce = "시카고 스타일 소스";

        toppings.add("시카고 스타일 치즈");
    }

    void cut() {
        System.out.println("시카고 스타일로 자르기");
    }
}
