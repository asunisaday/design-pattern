package com.zz.command.v2;

import com.zz.command.Command;

public class RemoteCommand {

    Command[] onCommands;

    Command[] offCommands;

    public RemoteCommand() {
        onCommands = new Command[7];
        offCommands = new Command[7];

        Command noCommand = new NoCommand();
        for (int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }

    }
}
