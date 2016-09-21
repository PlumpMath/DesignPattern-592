package HeadFirst.Compound.observer;


/**
 * Created by NikoBelic on 9/21/16.
 */
public interface QuackObservable
{
    public void registerObserver(Observer observer);
    public void notifyObservers();
}
