package org.example.state.gumball2;

public class SoldState implements State {
    GumballMachine gumballMachine;
    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertQuarter() {
        System.out.println("상품을 내보내고 있습니다");
    }

    public void ejectQuarter() {
        System.out.println("이미 뽑으셨습니다");
    }

    public void turnCrank() {
        System.out.println("손잡이는 한 번만 돌려주세요");
    }

    public void dispense() {
        gumballMachine.releaseBall();
        if (gumballMachine.getCount() > 0) {
            gumballMachine.setState(gumballMachine.getNoQuarterState());
        } else {
            System.out.println("상품이 품절되었습니다");
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }
    }

    public void refill() {
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }
}
