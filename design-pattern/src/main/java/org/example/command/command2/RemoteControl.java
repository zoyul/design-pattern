package org.example.command.command2;

public class RemoteControl {
    // 여러 가지 커맨드(기기)의 명령을 처리할 수 있다
    Command[] onCommands;
    Command[] offCommands;

    public RemoteControl() {
        onCommands = new Command[7];
        offCommands = new Command[7];

        Command command = new NoCommand();
        for (int i = 0; i < 7; i++) {
            onCommands[i] = command;
            offCommands[i] = command;
        }
    }

    // 슬롯 번호와 그 슬롯에 저장할 On, Off 커맨드 객체를 인자로 전달받는다
    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
    }

    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
    }

}
