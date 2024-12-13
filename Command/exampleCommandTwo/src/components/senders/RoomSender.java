package components.senders;

import components.receiver.CurtainsReceiver;

public class RoomSender extends ComponentSender {

    private final CurtainsReceiver curtains;

    public RoomSender() {
        this.curtains = new CurtainsReceiver();
    }

    public CurtainsReceiver getCurtains() {
        return curtains;
    }

    public boolean curtainsOpen() {
        return curtains.isOpen();
    }

}