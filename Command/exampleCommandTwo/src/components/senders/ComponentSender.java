package components.senders;

import commands.Command;

public abstract class ComponentSender {

    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void executeCommand() {
        command.execute();
    }

}
