package org.example.factory.pizza4;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
    String name;
    String dough;
    String sauce;
    List<String> toppings = new ArrayList<>();

    void prepare() {
        System.out.println("준비중 : " + name);
        System.out.println("도우 올리는중 : " + dough);
        System.out.println("소스 올리는중 : " + sauce);
        for (String topping : toppings) {
            System.out.println("토픽 올리는중 : " + topping);
        }

    }
    void bake() {
        System.out.println("굽기");
    }
    void cut() {
        System.out.println("자르기");
    }
    void box() {
        System.out.println("포장하기");
    }
}