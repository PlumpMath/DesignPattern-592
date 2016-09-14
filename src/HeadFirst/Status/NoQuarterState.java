package HeadFirst.Status;

/**
 * @author NikoBelic
 * @create 9/14/16 09:37
 */
public class NoQuarterState implements State
{
    GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuater()
    {
        System.out.println("你插入了一枚硬币");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

    @Override
    public void ejectQuater() {
        System.out.println("你还没插入硬币呢");
    }

    @Override
    public void turnCrank() {
        System.out.println("你还没插入硬币呢");
    }

    @Override
    public void dispense() {
        System.out.println("你还没插入硬币呢");
    }
}
