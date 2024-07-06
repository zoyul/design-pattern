package org.example.factory.pizza5;

// NY 피자 원재료 팩토리
public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

    // 각 피자가게에서 사용하는 재료를 리턴하도록 함
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[]{ new Garlic(), new Onion(), new Mushroom() };
    }
}
