package HeadFirst.Command;

/**
 * @author NikoBelic
 * @create 9/6/16 16:00
 */
public class RemoteControl
{
    Command[] onCommands;
    Command[] offCommands;
    Command undoCommand;
    private static final int SLOTNUM = 7;
    public RemoteControl()
    {
        onCommands = new Command[SLOTNUM];
        offCommands = new Command[SLOTNUM];
        Command noCommand = new NoCommand();
        for (int i = 0; i < SLOTNUM; i++)
        {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }

    public void setCommand(int slot,Command onCommand,Command offCommand)
    {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }
    public void onButtonWasPressed(int slot)
    {
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }
    public void offButtonWasPressed(int slot)
    {
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }
    public void undoButtonPressed()
    {
        undoCommand.undo();
    }

    public String toString()
    {
        StringBuffer sb = new StringBuffer();
        sb.append("\n-------- Remote Control --------\n");
        for (int i = 0; i < onCommands.length; i++)
        {
            sb.append("[slot" + i + "] ").append(onCommands[i].getClass().getSimpleName()).append("      ");
            sb.append(offCommands[i].getClass().getSimpleName()).append("\n");
        }
        return sb.toString();
    }
}
