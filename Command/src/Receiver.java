/**
 * The Receiver class contains some business logic. Almost any object may act as a receiver.
 * Most commands only handle the details of how a request is passed to the receiver, while the receiver itself does the actual work.
 */
public class Receiver {

    private boolean stateOfOperation = false;

    public void operation() {
        stateOfOperation = !stateOfOperation;
    }

    public boolean isOperationDone() {
        return stateOfOperation;
    }

}
