package HeadFirst.Compound.duck;

import HeadFirst.Compound.Quackable;
import HeadFirst.Compound.observer.Observable;
import HeadFirst.Compound.observer.Observer;


/**
 * @author NikoBelic
 * @create 9/21/16 19:09
 */
public class MallardDuck implements Quackable
{
    Observable observable;

    public MallardDuck()
    {
        observable = new Observable(this);
    }

    @Override
    public void quack() {
        System.out.println("Quack");
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }
}
