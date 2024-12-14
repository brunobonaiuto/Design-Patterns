package receiver;

/**
 * Receiver
 */
public class RadioStereo implements DeviceReceiver{
    @Override
    public void turnOn() {
        System.out.println("Stereo is now on");
    }

    @Override
    public void turnOff() {
        System.out.println("Stereo is now off");
    }

    public void adjustVolume() {
        System.out.println("Volume adjusted");
    }
}
