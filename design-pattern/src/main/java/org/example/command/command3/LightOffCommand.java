package org.example.command.command3;

public class LightOffCommand implements Command {

    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    // 만약 다양한 일을 시키고 싶다면 커스텀 할 수 있다.
    @Override
    public void execute() {
        light.off();
        light.alarm();
    }

    @Override
    public void undo() {
        light.on();
    }
}
