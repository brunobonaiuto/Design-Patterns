package components;

import commands.Command;

public abstract class AbstractButtonSender {

    private Command command;

    public void setCommand(Command copyCommand) {
        this.command = copyCommand;
    }

    public void executeCommand() {
        command.execute();
    }

}
