package HeadFirst.Compound;

import HeadFirst.Compound.observer.QuackObservable;

/**
 * @author NikoBelic
 * @create 9/21/16 19:08
 */
public interface Quackable extends QuackObservable
{
    public void quack();
}
