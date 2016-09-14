package HeadFirst.Status;

/**
 * @author NikoBelic
 * @create 9/14/16 09:57
 */
public class SoldState implements State
{
    GumballMachine gumballMachine;

    public SoldState(GumballMachine gumballMachine)
    {
        this.gumballMachine = gumballMachine;
    }
    @Override
    public void dispense() {
        System.out.println("当当当当~~糖果出来啦!");
        gumballMachine.releaseBall();
        if (gumballMachine.getCount() > 0)
        {
            gumballMachine.setState(gumballMachine.getNoQuarterState());
        }
        else {
            System.out.println("糖果机的糖果卖完啦!");
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }
    }

    @Override
    public void turnCrank() {
        System.out.println("滚,瞎转什么?");
    }

    @Override
    public void ejectQuater() {
        System.out.println("不给退钱!都做上了!");
    }

    @Override
    public void insertQuater() {
        System.out.println("别给钱了!这次的还没做完呢");
    }
}
