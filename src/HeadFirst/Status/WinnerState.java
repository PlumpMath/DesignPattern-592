package HeadFirst.Status;

/**
 * @author NikoBelic
 * @create 9/14/16 10:43
 */
public class WinnerState implements State
{
    GumballMachine gumballMachine;
    public WinnerState(GumballMachine gumballMachine)
    {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuater() {
        System.out.println("你已经插入过硬币了");
    }

    @Override
    public void ejectQuater() {
        System.out.println("糖果正在出炉了,不能退钱");
    }

    @Override
    public void turnCrank() {
        System.out.println("你已经转动过了");
    }

    @Override
    public void dispense() {
        System.out.println("嘿!你赢了!我给你两个糖果!");
        gumballMachine.releaseBall();
        if (gumballMachine.getCount() == 0)
            gumballMachine.setState(gumballMachine.getSoldOutState());
        else {
            gumballMachine.releaseBall();
            if (gumballMachine.getCount() > 0)
                gumballMachine.setState(gumballMachine.getNoQuarterState());
            else
                gumballMachine.setState(gumballMachine.getSoldOutState());
        }
    }
}
