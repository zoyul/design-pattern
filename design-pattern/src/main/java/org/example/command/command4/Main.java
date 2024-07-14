package org.example.command.command4;

public class Main {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        CeilingFan ceilingFan = new CeilingFan();
        CeilingFanOffCommand ceilingFanOffCommand = new CeilingFanOffCommand(ceilingFan);
        CeilingFanMediumCommand ceilingFanMediumCommand = new CeilingFanMediumCommand(ceilingFan);
        CeilingFanHighCommand ceilingFanHighCommand = new CeilingFanHighCommand(ceilingFan);

        remoteControl.setCommand(0, ceilingFanMediumCommand, ceilingFanOffCommand);
        remoteControl.setCommand(1, ceilingFanHighCommand, ceilingFanOffCommand);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        // off 작업을 취소하면 다시 medium
        remoteControl.undoButtonWasPushed();
        System.out.println(ceilingFan.getSpeed());

        remoteControl.onButtonWasPushed(1);
        // on 작업을 취소하면 다시 medium
        remoteControl.undoButtonWasPushed();
        System.out.println(ceilingFan.getSpeed());
    }
}
