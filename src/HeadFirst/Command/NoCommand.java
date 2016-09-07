package HeadFirst.Command;

/**
 * @author NikoBelic
 * @create 9/6/16 16:02
 */
public class NoCommand implements Command
{
    @Override
    public void execute() {
        System.out.println("Do Nothing...");
    }

    @Override
    public void undo() {
        System.out.println("Undo Nothing");
    }
}
