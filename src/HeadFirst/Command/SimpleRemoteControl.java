package HeadFirst.Command;

/**
 * @author NikoBelic
 * @create 9/6/16 15:17
 */
public class SimpleRemoteControl
{
    Command command;
    public SimpleRemoteControl()
    { }

    public void setCommand(Command command)
    {
        this.command = command;
    }

    public void buttonWasPressed()
    {
        command.execute();
    }
}
