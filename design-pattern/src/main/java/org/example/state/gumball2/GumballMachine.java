package org.example.state.gumball2;

public class GumballMachine {

    // 모든 상태 객체 선언
    State soldOutState;
    State noQuarterState;
    State hasQuarterState;
    State soldState;

    State state;
    // 상품 개수 저장
    int count = 0;

    public GumballMachine(int numberGumballs) {
        this.soldOutState = new SoldOutState(this);
        this.noQuarterState = new NoQuarterState(this);
        this.hasQuarterState = new HasQuarterState(this);
        this.soldState = new SoldState(this);
        this.count = numberGumballs;
        if (numberGumballs > 0) {
            state = noQuarterState;
        } else {
            state = soldState;
        }
    }

    // 행동 메서드 구현 : 현재 상태가 작업을 처리하도록 한다
    public void insertQuarter() {
        state.insertQuarter();
    }
    public void ejectQuarter() {
        state.ejectQuarter();
    }
    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    // 다른 객체에서 뽑기 기계의 상태를 다른 상태로 전환할 수 있다
    void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

    void releaseBall() {
        System.out.println("상품을 내보내고 있습니다");
        if (count > 0) {
            count -= 1;
        }
    }

    public int getCount() {
        return count;
    }
}
