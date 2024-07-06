package org.example.factory.pizza4;

public class ChicagoStylePizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new ChicagoCheesePizza();
            System.out.println("Chicago Cheese Pizza 만들기");
        }
        return pizza;
    }
}
