package HeadFirst.Status;

/**
 * @author NikoBelic
 * @create 9/14/16 09:38
 */
public class GumballMachine
{
    State soldOutState;
    State noQuarterState;
    State hasQuarterState;
    State soldState;
    State winnerState;

    State state = soldOutState;
    int count = 0;

    public GumballMachine(int numberGumballs)
    {
        hasQuarterState = new HasQuarterState(this);
        noQuarterState = new NoQuarterState(this);
        soldState = new SoldState(this);
        soldOutState = new SoldOutState(this);
        winnerState = new WinnerState(this);
        this.count = numberGumballs;
        if (numberGumballs > 0)
            this.state = noQuarterState;
    }

    public void insertQuarter()
    {
        state.insertQuater();
    }

    public void ejectQuarter()
    {
        state.ejectQuater();
    }
    public void turnCrank()
    {
        state.turnCrank();
        state.dispense();
    }
    public void setState(State state)
    {
        this.state = state;
    }

    void releaseBall()
    {
        System.out.println("一个糖果滚了出来");
        if (count != 0)
        {
            count = count - 1;
        }
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getWinnerState() {
        return winnerState;
    }

    public int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "GumballMachine{" +
                "state=" + state.getClass().getSimpleName() +
                ", count=" + count +
                '}';
    }
}
