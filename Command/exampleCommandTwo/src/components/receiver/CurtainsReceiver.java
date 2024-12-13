package components.receiver;

public class CurtainsReceiver {

    private boolean open = false;

    public void openCloseOperation() {
        open = !open;
    }

    public boolean isOpen() {
        return open;
    }

}
