package org.example.command.command5;

public class Main {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();
        Light light = new Light();
        CeilingFan ceilingFan = new CeilingFan();
        GarageDoor garageDoor = new GarageDoor();
        Stereo stereo = new Stereo();

        LightOnCommand lightOn = new LightOnCommand(light);
        LightOffCommand lightOff = new LightOffCommand(light);
        CeilingFanOnCommand ceilingFanOn = new CeilingFanOnCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);
        GarageDoorOnCommand garageDoorOn = new GarageDoorOnCommand(garageDoor);
        GarageDoorOffCommand garageDoorOff = new GarageDoorOffCommand(garageDoor);
        StereoOnCommand stereoOn = new StereoOnCommand(stereo);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);

        Command[] onCommands = {lightOn, ceilingFanOn, garageDoorOn, stereoOn};
        Command[] offCommands = {lightOff, ceilingFanOff, garageDoorOff, stereoOff};

        MacroCommand macroOnCommand = new MacroCommand(onCommands);
        MacroCommand macroOffCommand = new MacroCommand(offCommands);

        remoteControl.setCommand(0, macroOnCommand, macroOffCommand);
        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
    }
}
