package org.example.state.gumball1;

public class GumballMachine {

    // 뽑기 기계는 각 상태를 변수로 관리
    final static int SOLD_OUT = 0;      // 상품 없음
    final static int NO_QUARTER = 1;        // 동전 없음
    final static int HAS_QUARTER = 2;       // 동전 있음
    final static int SOLD = 3;      // 상품 있음

    int state = SOLD_OUT;
    int count = 0;

    public GumballMachine(int count) {
        this.count = count;
        if (count > 0) {
            state = NO_QUARTER;
        }
    }

    // 각 행동을 메소드로 구현
    // 동전이 투입된 경우
    public void insertQuarter() {
        if (state == HAS_QUARTER) {
            System.out.println("동전은 한 개만 넣어주세요");
        } else if (state == NO_QUARTER) {
            state = HAS_QUARTER;
            System.out.println("동전을 넣으셨습니다");
        } else if (state == SOLD_OUT) {
            System.out.println("매진되었습니다. 다음 기회에 이용해 주세요.");
        } else if (state == SOLD) {
            System.out.println("상품을 내보내고 있습니다.");
        }
    }

    // 동전을 반환받으려 하는 경우
    public void ejectQuarter() {
        if (state == HAS_QUARTER) {
            System.out.println("동전이 반환됩니다");
            state = NO_QUARTER;
        } else if (state == NO_QUARTER) {
            System.out.println("동전을 넣어주세요");
        } else if (state == SOLD) {
            System.out.println("이미 상품를 뽑으셨습니다");
        } else if (state == SOLD_OUT) {
            System.out.println("동전을 넣지 않으셨습니다. 동전이 반환되지 않습니다.");
        }
    }

    // 손잡이를 돌리는 경우
    // 상품을 내보내는 경우
}
