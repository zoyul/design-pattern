package org.example.command.command3;

public class Main {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();
        Light livingRoomRight = new Light();

        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomRight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomRight);

        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);

        remoteControl.onButtonWasPushed(0);
        remoteControl.undoButtonWasPushed();
    }
}
