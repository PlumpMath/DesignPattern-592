package HeadFirst.Proxy;

import HeadFirst.Status.GumballMachine;

/**
 * @author NikoBelic
 * @create 9/20/16 14:16
 */
public class GumballMonitor
{
    GumballMachine machine;
    public GumballMonitor(GumballMachine machine)
    {
        this.machine = machine;
    }

    public void report()
    {
        System.out.println("Gunball Machine:" + machine.getLocation());
        System.out.println("Current inventory:" + machine.getCount() + " gumballs");
        System.out.println("Gunball state:" + machine.getState());
    }
}
