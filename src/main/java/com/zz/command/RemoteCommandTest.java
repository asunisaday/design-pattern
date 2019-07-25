package com.zz.command;

public class RemoteCommandTest {
    public static void main(String[] args) {

        Light light = new Light();
        Command command = new LightCommand(light);
        SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl();
        simpleRemoteControl.setCommand(command);

        simpleRemoteControl.btnWasPressed();
    }
}
