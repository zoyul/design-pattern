package org.example.factory.pizza4;

public class NYStylePizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new NYCheesePizza();
            System.out.println("NY Cheese Pizza 만들기");
        }
        return pizza;
    }
}