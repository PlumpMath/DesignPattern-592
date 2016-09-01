package HeadFirst.Strategy.impl.behavior;

import HeadFirst.Strategy.QuackBehavior;

/**
 * @author NikoBelic
 * @create 16/8/30 13:04
 */
public class Quack implements QuackBehavior
{
    @Override
    public void quack() {
        System.out.println("Gua Gua...");
    }
}
