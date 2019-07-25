package com.zz.command;

public class SimpleRemoteControl {

    Command command;

    public SimpleRemoteControl() {

    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void btnWasPressed() {
        command.execute();
    }
}
