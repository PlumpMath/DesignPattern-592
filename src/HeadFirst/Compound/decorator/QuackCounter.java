package HeadFirst.Compound.decorator;

import HeadFirst.Compound.Quackable;
import HeadFirst.Compound.observer.Observer;

/**
 * @author NikoBelic
 * @create 9/21/16 19:16
 */
public class QuackCounter implements Quackable
{
    Quackable duck;
    static int numberOfQuacks;
    public QuackCounter(Quackable duck)
    {
        this.duck = duck;
    }

    @Override
    public void quack() {
        duck.quack();
        numberOfQuacks++;
    }

    public static int getNumberOfQuacks() {
        return numberOfQuacks;
    }

    @Override
    public void registerObserver(Observer observer) {
        duck.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        duck.notifyObservers();
    }
}
