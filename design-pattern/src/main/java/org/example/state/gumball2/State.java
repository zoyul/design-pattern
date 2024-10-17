package org.example.state.gumball2;

public interface State {

    // 상태 클래스에서 행동 메서드를 추상화한다
    void insertQuarter();
    void ejectQuarter();
    void turnCrank();
    void dispense();
    void refill();
}
