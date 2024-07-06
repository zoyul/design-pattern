package org.example.factory.pizza1;

public class PizzaStore {
    public Pizza orderPizza(String type) {
        Pizza pizza = null;

        // 변하는 부분
        if (type.equals("cheese")) {
            pizza = new CheesePizza();
        } else if (type.equals("greek")) {
            pizza = new GreekPizza();
        } else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza();
        }

        // 변하지 않는 부분
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
