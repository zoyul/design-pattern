package org.example.adapter.duck1;

// 타킷 인터페이스인 duck을 구현
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
