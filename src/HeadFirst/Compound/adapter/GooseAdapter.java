package HeadFirst.Compound.adapter;

import HeadFirst.Compound.Quackable;
import HeadFirst.Compound.goose.Goose;
import HeadFirst.Compound.observer.Observable;
import HeadFirst.Compound.observer.Observer;

/**
 * @author NikoBelic
 * @create 9/21/16 19:14
 */
public class GooseAdapter implements Quackable
{
    Goose goose;
    Observable observable;

    public GooseAdapter() {
        observable = new Observable(this);
    }

    public GooseAdapter(Goose goose)
    {
        this.goose = goose;
    }

    @Override
    public void quack()
    {
        goose.honk();
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
