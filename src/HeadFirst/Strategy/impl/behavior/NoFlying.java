package HeadFirst.Strategy.impl.behavior;

import HeadFirst.Strategy.FlyBehavior;

/**
 * @author NikoBelic
 * @create 16/8/30 13:04
 */
public class NoFlying implements FlyBehavior
{
    @Override
    public void fly() {
        System.out.println("I can't fly...");
    }
}
