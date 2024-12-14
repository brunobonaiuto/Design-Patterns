package command;

import receiver.DeviceReceiver;

/** Concrete command for turning a device on
 */
public class TurnOnCommand implements Command {
    private DeviceReceiver device;

    public TurnOnCommand(DeviceReceiver device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.turnOn();
    }
}