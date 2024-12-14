package command;

import receiver.RadioStereo;

/** Concrete command for adjusting the volume of a stereo
 */
public class AdjustVolumeCommand implements Command {
    private RadioStereo stereo;

    public AdjustVolumeCommand(RadioStereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.adjustVolume();
    }
}
