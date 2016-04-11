package Singleton;

/**
 * @author NikoBelic
 * @create 20:08
 */
public class SingletonTest
{
    public static void main(String[] args)
    {
        Hungry h1 = Hungry.getInstance();
        Hungry h2 = Hungry.getInstance();
        if (h1 == h2)
            System.out.println("饿汉式成功");
        Lazy l1 = Lazy.getInstance();
        Lazy l2 = Lazy.getInstance();
        if(l1 == l2)
            System.out.println("懒汉式成功");
    }
}
