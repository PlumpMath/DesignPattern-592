package HeadFirst.Compound.component;

import HeadFirst.Compound.Quackable;
import HeadFirst.Compound.observer.Observer;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author NikoBelic
 * @create 9/21/16 19:29
 */
public class Flock implements Quackable
{
    ArrayList quackers = new ArrayList<>();

    public void add(Quackable duck)
    {
        quackers.add(duck);
    }
    @Override
    public void quack()
    {
        Iterator iterator = quackers.iterator();
        while (iterator.hasNext())
        {
            Quackable quacker = (Quackable) iterator.next();
            quacker.quack();
        }
    }

    @Override
    public void registerObserver(Observer observer) {
        Iterator iterator = quackers.iterator();
        while (iterator.hasNext())
        {
            Quackable duck = (Quackable) iterator.next();
            duck.registerObserver(observer);
        }
    }

    @Override
    public void notifyObservers() {

    }
}
