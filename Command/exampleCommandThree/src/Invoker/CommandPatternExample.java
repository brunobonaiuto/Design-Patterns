package Invoker;

import command.*;
import receiver.RadioStereo;
import receiver.TV;

/**
 * Client
 */
public class CommandPatternExample {
    public static void main(String[] args) {

        // Create devices
        TV tv = new TV();
        RadioStereo radioStereo = new RadioStereo();

        // Create command objects
        Command turnOnTVCommand = new TurnOnCommand(tv);
        Command turnOffTVCommand = new TurnOffCommand(tv);
        Command adjustVolumeStereoCommand = new AdjustVolumeCommand(radioStereo);
        Command changeChannelTVCommand = new ChangeChannelCommand(tv);

        // Create remote control
        RemoteControl remote = new RemoteControl();

        // Set and execute commands
        remote.setCommand(turnOnTVCommand);
        remote.pressButton(); // Outputs: TV is now on

        remote.setCommand(adjustVolumeStereoCommand);
        remote.pressButton(); // Outputs: Volume adjusted

        remote.setCommand(changeChannelTVCommand);
        remote.pressButton(); // Outputs: Channel changed

        remote.setCommand(turnOffTVCommand);
        remote.pressButton(); // Outputs: TV is now off
    }
}