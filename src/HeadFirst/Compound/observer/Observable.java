package HeadFirst.Compound.observer;

import java.util.ArrayList;

/**
 * @author NikoBelic
 * @create 9/21/16 19:40
 */
public class Observable implements QuackObservable
{
    ArrayList<Observer> observers = new ArrayList();
    QuackObservable duck;

    public Observable(QuackObservable duck) {
        this.duck = duck;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers()
    {
        for (Observer observer : observers)
        {
            observer.update(duck);
        }
    }
}
