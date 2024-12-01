/**
 * The Sender class (aka invoker) is responsible for initiating requests. This class must have a field for storing a reference to a command object.
 * The sender starts that command instead of sending the request directly to the receiver.
 * Note that the sender isn’t responsible for creating the command object. Usually, it gets a pre-created command from the client via the constructor.
 */
//This could be an abstract sender
public abstract class Sender {
    /**
     * Field for storing a reference to a command object.
     */
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void executeCommand() {
        command.execute();
    }

}