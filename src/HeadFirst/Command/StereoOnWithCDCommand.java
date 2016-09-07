package HeadFirst.Command;

/**
 * @author NikoBelic
 * @create 9/6/16 16:40
 */
public class StereoOnWithCDCommand implements Command
{
    Stereo stereo;
    public StereoOnWithCDCommand(Stereo stereo)
    {
        this.stereo = stereo;
    }
    @Override
    public void execute()
    {
        stereo.on();
        stereo.setCD();
        stereo.setVolume(11);
    }

    @Override
    public void undo() {
        stereo.off();
    }
}
