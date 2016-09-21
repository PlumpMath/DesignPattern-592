package HeadFirst.Compound.factory;

import HeadFirst.Compound.Quackable;
import HeadFirst.Strategy.impl.behavior.Quack;

/**
 * @author NikoBelic
 * @create 9/21/16 19:19
 */
public abstract class AbstractDuckFactory
{
    public abstract Quackable createMallardDuck();
    public abstract Quackable createRedheadDuck();
    public abstract Quackable createDuckCall();
    public abstract Quackable createRubberDuck();
    public abstract Quackable createGooseDuck();
}
