package command;

/**
 * The Command interface usually declares just a single method for executing the command.
 */
public interface Command {
    /**
     * determines the instructions for such as Command.
     */
    void execute();

}