package HeadFirst.Status;

/**
 * @author NikoBelic
 * @create 9/14/16 13:28
 */
public class GamballMachineDrive
{
    public static void main(String[] args)
    {
        GumballMachine gumballMachine = new GumballMachine(5);
        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);
        System.out.println("-------------------");

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);
    }
}
