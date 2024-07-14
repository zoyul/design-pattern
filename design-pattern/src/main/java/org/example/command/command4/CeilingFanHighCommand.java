package org.example.command.command4;

public class CeilingFanHighCommand implements Command {
    CeilingFan ceilingFan;
    int prevSpeed;

    public CeilingFanHighCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        // 선풍기 속도를 변경하기 전 이전 속도를 저장
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.high();
    }

    // 작업을 취소하면, 이전 속도로 다시 돌아감
    @Override
    public void undo() {
        switch (prevSpeed) {
            case CeilingFan.HIGH:
                ceilingFan.high();
                break;
            case CeilingFan.MEDIUM:
                ceilingFan.medium();
                break;
            case CeilingFan.LOW:
                ceilingFan.low();
                break;
            default:
                ceilingFan.off();
                break;
        }
    }
}