package org.example.factory.pizza5;

// 원재료 팩토리 인터페이스 만들기
public interface PizzaIngredientFactory {
 
	public Dough createDough();
	public Sauce createSauce();
	public Cheese createCheese();
	public Veggies[] createVeggies();
 
}
