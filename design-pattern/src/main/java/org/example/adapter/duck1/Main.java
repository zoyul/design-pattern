package org.example.adapter.duck1;

public class Main {

    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        Turkey turkey = new WildTurKey();
        Duck turkeyAdaptor = new TurkeyAdaptor(turkey);

        System.out.println("칠면조");
        turkey.gobble();
        turkey.fly();
        System.out.println("");

        System.out.println("오리");
        duck.quack();
        duck.fly();
        System.out.println("");

        System.out.println("칠면조 어댑터");
        turkeyAdaptor.quack();
        turkeyAdaptor.fly();
        System.out.println("");
    }
}
