package org.example.adapter.duck1;

public class WildTurKey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("골골");
    }

    @Override
    public void fly() {
        System.out.println("짧은 거리를 날고있어용 !");
    }
}
