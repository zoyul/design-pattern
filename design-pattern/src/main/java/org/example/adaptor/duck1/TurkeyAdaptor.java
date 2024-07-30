package org.example.adaptor.duck1;

public class TurkeyAdaptor implements Duck {
    Turkey turkey;

    public TurkeyAdaptor(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        for (int i = 0; i < 5; i++) {
            turkey.fly();
        }
    }
}
