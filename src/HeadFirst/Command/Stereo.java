package HeadFirst.Command;

/**
 * @author NikoBelic
 * @create 9/6/16 16:40
 */
public class Stereo
{
    public void on()
    {
        System.out.println("Stereo is turned on.");
    }
    public void off()
    {
        System.out.println("Stereo is turned off");
    }
    public void setCD()
    {
        System.out.println("Playing CD...");
    }
    public void setVolume(int vol)
    {
        System.out.println("Volume is " + vol);
    }
}
