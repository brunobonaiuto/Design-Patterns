package components.senders;

import components.receiver.LightReceiver;

public class FloorLampSender extends ComponentSender {

    private final LightReceiver lightReceiver;

    public FloorLampSender() {
        this.lightReceiver = new LightReceiver();
    }

    public LightReceiver getLight() {
        return lightReceiver;
    }

    public boolean isLightOn() {
        return lightReceiver.isSwitchedOn();
    }

}