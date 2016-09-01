package HeadFirst.Strategy;

import HeadFirst.Strategy.impl.WaterDuck;
import HeadFirst.Strategy.impl.behavior.FlyWithWings;

/**
 * @author NikoBelic
 * @create 16/8/30 13:09
 */
public class Test
{
    public static void main(String[] args)
    {
        WaterDuck duck = new WaterDuck();
        duck.display();
        System.out.println("============ 水鸭子进化-飞天鸭兽 ============");
        duck.setFlyBehavior(new FlyWithWings());
        duck.display();
    }

}
