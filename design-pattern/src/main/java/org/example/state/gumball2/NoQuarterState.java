package org.example.state.gumball2;

// state 인터페이스를 구현
public class NoQuarterState implements State {

    GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    // 누군가 동전을 넣으면, 그에 맞는 메시지가 나오고, 기계의 상태를 전환
    @Override
    public void insertQuarter() {
        System.out.println("동전을 넣으셨습니다");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

    @Override
    public void ejectQuarter() {
        System.out.println("동전을 넣어주세요");
    }

    @Override
    public void turnCrank() {
        System.out.println("동전을 넣어주세요");
    }

    @Override
    public void dispense() {
        System.out.println("동전을 넣어주세요");
    }

    @Override
    public void refill() {}
}
