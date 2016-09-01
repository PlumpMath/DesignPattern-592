package HeadFirst.Strategy.impl;

import HeadFirst.Strategy.Duck;
import HeadFirst.Strategy.impl.behavior.NoFlying;
import HeadFirst.Strategy.impl.behavior.Quack;

/**
 * @author NikoBelic
 * @create 16/8/30 13:06
 */
public class WaterDuck extends Duck
{
    public WaterDuck()
    {
        this.quackBehavior = new Quack();
        this.flyBehavior = new NoFlying();
    }

    @Override
    public void display() {
        System.out.println("我是水鸭子");
        this.quackBehavior.quack();
        this.flyBehavior.fly();
    }
}
