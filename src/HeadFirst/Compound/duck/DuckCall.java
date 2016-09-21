package HeadFirst.Compound.duck;

import HeadFirst.Compound.Quackable;
import HeadFirst.Compound.observer.Observable;
import HeadFirst.Compound.observer.Observer;

/**
 * @author NikoBelic
 * @create 9/21/16 19:10
 */
public class DuckCall implements Quackable
{
    Observable observable;

    public DuckCall() {
        this.observable = new Observable(this);
    }

    @Override
    public void quack() {
        System.out.println("Kwak");
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
