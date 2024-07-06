package org.example.factory.pizza4;

public abstract class PizzaStore {

    public Pizza orderPizza(String type) {
        // 팩토리 객체가 아닌 PizzaStore에 있는 createPizza 호출
        Pizza pizza = createPizza(type);

        // 모든 지점이 동일
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    // 지점마다 달라지는 부분
    // 팩토리 객체의 팩토리 메서드가 PizzaStore의 추상 메서드로 변경
     abstract Pizza createPizza(String type);
}
