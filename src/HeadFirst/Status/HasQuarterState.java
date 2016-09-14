package HeadFirst.Status;

import java.util.Random;

/**
 * @author NikoBelic
 * @create 9/14/16 09:54
 */
public class HasQuarterState implements State
{
    GumballMachine gumballMachine;
    Random randomWinner = new Random(System.currentTimeMillis());
    public HasQuarterState(GumballMachine gumballMachine)
    {
        this.gumballMachine = gumballMachine;
    }
    @Override
    public void insertQuater()
    {
        System.out.println("你已经插入过硬币了");
    }

    @Override
    public void ejectQuater()
    {
        System.out.println("好的,硬币退回来了");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    @Override
    public void turnCrank() {
        System.out.println("好的,糖果马上就会做好");
        int winner = randomWinner.nextInt(10);
        System.out.println("抽取到数字为 " + winner);
        if ((winner == 0) && (gumballMachine.getCount() > 1))
        {
            gumballMachine.setState(gumballMachine.getWinnerState());
        }
        else
        {
            gumballMachine.setState(gumballMachine.getSoldState());
        }
    }

    @Override
    public void dispense()
    {
        System.out.println("别急啊~糖果还没做好");
    }
}
