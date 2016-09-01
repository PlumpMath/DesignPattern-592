package HeadFirst.Strategy.impl.behavior;

import HeadFirst.Strategy.FlyBehavior;

/**
 * @author NikoBelic
 * @create 16/8/30 13:03
 */
public class FlyWithWings implements FlyBehavior
{
    @Override
    public void fly()
    {
        System.out.println("Flying with wings...");
    }
}
