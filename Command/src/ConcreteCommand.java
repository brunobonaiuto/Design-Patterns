/**
 * Concrete Commands implement various kinds of requests.
 * A concrete command isn’t supposed to perform the work on its own, but rather to pass the call to one of the business logic objects.
 */
public final class ConcreteCommand implements Command {

    /**
     * Parameters required to execute a method on a receiving object can be declared as fields in the concrete command.
     */
    private final Receiver receiver;

    /**
     * You can make command objects immutable by only allowing the initialization of these fields via the constructor.
     */
    public ConcreteCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.operation();
    }

}
