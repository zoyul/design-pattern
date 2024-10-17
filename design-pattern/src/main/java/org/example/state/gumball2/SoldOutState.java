package org.example.state.gumball2;

public class SoldOutState implements State {

    GumballMachine gumballMachine;
    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertQuarter() {
        System.out.println("상품이 품절되었습니다");
    }

    public void ejectQuarter() {
        System.out.println("상품이 품절되었습니다");
    }

    public void turnCrank() {
        System.out.println("상품이 품절되었습니다");
    }

    public void dispense() {
        System.out.println("상품이 품절되었습니다");
    }

    public void refill() {
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }
}
