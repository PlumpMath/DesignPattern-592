package HeadFirst.Compound.factory;

import HeadFirst.Compound.Quackable;
import HeadFirst.Compound.adapter.GooseAdapter;
import HeadFirst.Compound.duck.DuckCall;
import HeadFirst.Compound.duck.MallardDuck;
import HeadFirst.Compound.duck.ReadheadDuck;
import HeadFirst.Compound.duck.RubberDuck;
import HeadFirst.Compound.goose.Goose;

/**
 * @author NikoBelic
 * @create 9/21/16 19:21
 */
public class DuckFactory extends AbstractDuckFactory
{
    @Override
    public Quackable createMallardDuck() {
        return new MallardDuck();
    }

    @Override
    public Quackable createRedheadDuck() {
        return new ReadheadDuck();
    }

    @Override
    public Quackable createDuckCall() {
        return new DuckCall();
    }

    @Override
    public Quackable createRubberDuck() {
        return new RubberDuck();
    }

    @Override
    public Quackable createGooseDuck() {
        return new GooseAdapter(new Goose());
    }
}
