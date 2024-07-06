package org.example.factory.pizza5;

public abstract class PizzaStore {
 
	protected abstract Pizza createPizza(String item);
 
	public Pizza orderPizza(String type) {
		Pizza pizza = createPizza(type);
		pizza.prepare();

		return pizza;
	}
}
