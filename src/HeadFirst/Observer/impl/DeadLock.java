package HeadFirst.Observer.impl;

import java.util.Objects;

/**
 * @author NikoBelic
 * @create 16/9/1 10:36
 */
public class DeadLock
{

    public static void main(String[] args)
    {
        ShowDemo o1 = new ShowDemo();
        ShowDemo o2 = new ShowDemo();

        new Thread(new Runnable()
        {
            @Override
            public void run() {
                synchronized (o1)
                {
                    System.out.println("本线程现在持有o1的锁");
                    try
                    {
                        Thread.sleep(5000);
                    } catch (InterruptedException e)
                    {
                        e.printStackTrace();
                    }
                    System.out.println("我现在要去访问o2,需要拿o2锁了");
                    o2.display("我是o2");
                }
            }
        }).start();

        new Thread(new Runnable()
        {
            @Override
            public void run() {
                synchronized (o2)
                {
                    System.out.println("本线程现在持有o2的锁");
                    try
                    {
                        Thread.sleep(6000);
                    } catch (InterruptedException e)
                    {
                        e.printStackTrace();
                    }
                    System.out.println("我现在要去访问o1,需要拿o1锁了");
                    o1.display("我是o1");
                }
            }
        }).start();
    }

}
