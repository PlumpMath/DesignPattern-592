package HeadFirst.Command;

/**
 * @author NikoBelic
 * @create 9/6/16 15:19
 */
public class RemoteControlTest
{
    public static void main(String[] args)
    {
        //SimpleRemoteControl control = new SimpleRemoteControl();
        //Command lightCommand = new LightOnCommand(new Light());
        //control.setCommand(lightCommand);
        //control.buttonWasPressed();

        RemoteControl control = new RemoteControl();
        LightOnCommand lightOnCommand = new LightOnCommand(new Light());
        StereoOnWithCDCommand stereoOnWithCDCommand = new StereoOnWithCDCommand(new Stereo());
        control.setCommand(0,stereoOnWithCDCommand,new NoCommand());
        control.setCommand(1,lightOnCommand,new NoCommand());
        System.out.println(control);


        control.onButtonWasPressed(0);
        control.undoButtonPressed();
        control.onButtonWasPressed(1);
        control.undoButtonPressed();
    }
}
