package components.receiver;

public class LightReceiver {

    private boolean switchedOn = false;

    // public void operation()
    public void switchLightsOperation() {
        switchedOn = !switchedOn;
    }

    public boolean isSwitchedOn() {
        return switchedOn;
    }

}
