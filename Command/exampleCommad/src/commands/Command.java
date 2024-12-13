package commands;

/**
 * The commands.Command interface usually declares just a single method for executing the command.
 */
public interface Command {
    /**
     * determines the instructions for such as commands.Command.
     *
     * @return
     */
    void execute();

}