package HeadFirst.Compound;

import HeadFirst.Compound.adapter.GooseAdapter;
import HeadFirst.Compound.component.Flock;
import HeadFirst.Compound.decorator.QuackCounter;
import HeadFirst.Compound.duck.DuckCall;
import HeadFirst.Compound.duck.MallardDuck;
import HeadFirst.Compound.duck.ReadheadDuck;
import HeadFirst.Compound.duck.RubberDuck;
import HeadFirst.Compound.factory.AbstractDuckFactory;
import HeadFirst.Compound.factory.CountingDuckFactory;
import HeadFirst.Compound.goose.Goose;
import HeadFirst.Compound.observer.Quackologist;
import HeadFirst.Strategy.impl.behavior.Quack;

/**
 * @author NikoBelic
 * @create 9/21/16 19:10
 */
public class DuckSimulator
{
    public static void main(String[] args)
    {
        DuckSimulator simulator = new DuckSimulator();
        AbstractDuckFactory duckFactory = new CountingDuckFactory();
        simulator.simulate(duckFactory);
    }
    void simulate(AbstractDuckFactory duckFactory)
    {
        System.out.println("\nDuck Simulator");
        // 3.使用 抽象工厂方法 让工厂直接生产会自动计数的鸭子
        Quackable mallardDuck = duckFactory.createMallardDuck();
        Quackable readheadDuck = duckFactory.createRedheadDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();

        // 1.使用 适配器模式 让鸭子也能quack()
        // 2.使用 装饰着模式 让鸭子的叫声被自动计数
        //Quackable gooseDuck = new QuackCounter(new GooseAdapter(new Goose()));
        // 3.1 为包含 鹅 的 鸭子 也使用 工厂方法 创建
        //Quackable gooseDuck = duckFactory.createGooseDuck();

        // 4.使用 组合模式 管理鸭子群
        Quackable mallardOne = duckFactory.createMallardDuck();
        Quackable mallardTwo = duckFactory.createMallardDuck();
        Quackable mallardThree = duckFactory.createMallardDuck();
        Quackable mallardFour = duckFactory.createMallardDuck();
        Flock flockOfMallards = new Flock();
        flockOfMallards.add(mallardOne);
        flockOfMallards.add(mallardTwo);
        flockOfMallards.add(mallardThree);
        flockOfMallards.add(mallardFour);

        Flock flockOfDucks = new Flock();
        flockOfDucks.add(mallardDuck);
        flockOfDucks.add(readheadDuck);
        flockOfDucks.add(duckCall);
        flockOfDucks.add(rubberDuck);
        flockOfDucks.add(flockOfMallards);

        System.out.println("\nDuck Simulator: Whole Flock Simulation");
        //simulate(flockOfDucks);

        System.out.println("\nDuck Simulator: With Observer");
        Quackologist quackologist = new Quackologist();
        flockOfDucks.registerObserver(quackologist);
        simulate(flockOfDucks);

        //simulate(mallardDuck);
        //simulate(readheadDuck);
        //simulate(duckCall);
        //simulate(rubberDuck);
        //simulate(gooseDuck);
        System.out.println("The ducks quacked " + QuackCounter.getNumberOfQuacks() + " times..");
    }
    void simulate(Quackable duck)
    {
        duck.quack();
    }
}
