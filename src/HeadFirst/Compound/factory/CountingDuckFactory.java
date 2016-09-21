package HeadFirst.Compound.factory;

import HeadFirst.Compound.Quackable;
import HeadFirst.Compound.adapter.GooseAdapter;
import HeadFirst.Compound.decorator.QuackCounter;
import HeadFirst.Compound.duck.DuckCall;
import HeadFirst.Compound.duck.MallardDuck;
import HeadFirst.Compound.duck.ReadheadDuck;
import HeadFirst.Compound.duck.RubberDuck;
import HeadFirst.Compound.goose.Goose;

/**
 * @author NikoBelic
 * @create 9/21/16 19:22
 */
public class CountingDuckFactory extends AbstractDuckFactory
{
    @Override
    public Quackable createMallardDuck() {
        return new QuackCounter(new MallardDuck());
    }

    @Override
    public Quackable createRedheadDuck() {
        return new QuackCounter(new ReadheadDuck());
    }

    @Override
    public Quackable createDuckCall() {
        return new QuackCounter(new DuckCall());
    }

    @Override
    public Quackable createRubberDuck() {
        return new QuackCounter(new RubberDuck());
    }

    @Override
    public Quackable createGooseDuck() {
        return new QuackCounter(new GooseAdapter(new Goose()));
    }
}
