package org.example.factory.pizza5;

public class CheesePizza extends Pizza {

    PizzaIngredientFactory pizzaIngredientFactory;

    public CheesePizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    void prepare() {
        Dough dough = pizzaIngredientFactory.createDough();
        Cheese cheese = pizzaIngredientFactory.createCheese();
        Sauce sauce = pizzaIngredientFactory.createSauce();
        Veggies[] veggies = pizzaIngredientFactory.createVeggies();
    }
}
