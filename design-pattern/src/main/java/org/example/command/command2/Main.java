package org.example.command.command2;

public class Main {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();
        Light livingRoomRight = new Light();
        CeilingFan ceilingFan = new CeilingFan();
        GarageDoor garageDoor = new GarageDoor();
        Stereo stereo = new Stereo();

        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomRight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomRight);
        CeilingFanOnCommand ceilingFanOn = new CeilingFanOnCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);
        GarageDoorOnCommand garageDoorOn = new GarageDoorOnCommand(garageDoor);
        GarageDoorOffCommand garageDoorOff = new GarageDoorOffCommand(garageDoor);
        StereoOnCommand stereoOn = new StereoOnCommand(stereo);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);

        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remoteControl.setCommand(1, ceilingFanOn, ceilingFanOff);
        remoteControl.setCommand(2, garageDoorOn, garageDoorOff);
        remoteControl.setCommand(3, stereoOn, stereoOff);
        // 람다 식으로 대체 가능
        // remoteControl.setCommand(3, () -> stereo.on(), () -> stereo.off());

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);
        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWasPushed(2);
        remoteControl.onButtonWasPushed(3);
        remoteControl.offButtonWasPushed(3);
    }
}
