package org.example.factory.pizza5;

public class NYPizzaStore extends PizzaStore {

	// 뉴욕 피자 가게는 뉴욕 원재료 팩토리를 사용
	protected Pizza createPizza(String item) {
		Pizza pizza = null;
		PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

		// 종류별로 피자를 만들 때 피자 원재료 팩토리를 주입해줌
		if (item.equals("cheese")) {
			pizza = new CheesePizza(ingredientFactory);
		} else if (item.equals("veggie")) {
			pizza = new VeggiePizza(ingredientFactory);
		}

		return pizza;
	}
}
