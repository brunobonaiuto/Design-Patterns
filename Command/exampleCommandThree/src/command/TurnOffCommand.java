package command;

import receiver.DeviceReceiver;

/** Concrete command for turning a device off
 */
public class TurnOffCommand implements Command {
    private DeviceReceiver device;

    public TurnOffCommand(DeviceReceiver device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.turnOff();
    }
}
