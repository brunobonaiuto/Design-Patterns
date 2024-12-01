public class Sender1 extends Sender {

    private final Receiver receiver;

    public Sender1() {
        this.receiver = new Receiver();
    }

    public Receiver getReceiver() {
        return receiver;
    }

    public boolean receiverOperationIsDone() {
        return receiver.isOperationDone();
    }
}