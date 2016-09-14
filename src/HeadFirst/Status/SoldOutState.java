package HeadFirst.Status;

/**
 * @author NikoBelic
 * @create 9/14/16 10:00
 */
public class SoldOutState implements State
{
    GumballMachine gumballMachine;
    public SoldOutState(GumballMachine gumballMachine)
    {
        this.gumballMachine = gumballMachine;
    }
    @Override
    public void insertQuater() {
        System.out.println("糖果卖完了!滚蛋吧!");
    }

    @Override
    public void ejectQuater() {
        System.out.println("滚!你还没插硬币呢!");
    }

    @Override
    public void turnCrank() {
        System.out.println("滚!你还没插硬币呢");
    }

    @Override
    public void dispense() {
        System.out.println("滚!你还没查硬币呢");
    }
}
