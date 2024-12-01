public class Sender2 extends Sender {

    private final Receiver receiver;

    public Sender2() {
        this.receiver = new Receiver();
    }

    public Receiver getReceiver() {
        return receiver;
    }

    public boolean receiverOperationIsDone() {
        return receiver.isOperationDone();
    }
}