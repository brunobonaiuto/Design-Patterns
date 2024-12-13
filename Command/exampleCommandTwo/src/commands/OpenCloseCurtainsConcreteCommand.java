package commands;


import components.receiver.CurtainsReceiver;

/**
 * Concrete Commands implement various kinds of requests.
 * A concrete command isn’t supposed to perform the work on its own, but rather to pass the call to one of the business logic objects.
 */
public final class OpenCloseCurtainsConcreteCommand implements Command {

    /**
     * Parameters required to execute a method on a receiving object can be declared as fields in the concrete command.
     */
    private final CurtainsReceiver curtainsReceiver;

    /**
     * You can make command objects immutable by only allowing the initialization of these fields via the constructor.
     */
    public OpenCloseCurtainsConcreteCommand(CurtainsReceiver curtainsReceiver) {
        this.curtainsReceiver = curtainsReceiver;
    }

    @Override
    public void execute() {
        curtainsReceiver.openCloseOperation();
    }

}
