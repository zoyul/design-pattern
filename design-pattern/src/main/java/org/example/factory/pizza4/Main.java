package org.example.factory.pizza4;

public class Main {

    public static void main(String[] args) {
        PizzaStore nyStore = new NYStylePizzaStore();
        PizzaStore chicagoStore = new ChicagoStylePizzaStore();

        Pizza nyPizza = nyStore.orderPizza("cheese");
        System.out.println("뉴욕에서 주문 : " + nyPizza.name);

        Pizza chicagoPizza = chicagoStore.orderPizza("cheese");
        System.out.println("시카고에서 주문 : " + chicagoPizza.name);
    }
}
