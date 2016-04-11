package Singleton;

/**
 * 饿汉式
 * 特点:类加载慢,获取实例快
 * @author NikoBelic
 * @create 20:05
 */
public class Hungry
{
    private static Hungry instance = new Hungry();
    private Hungry(){}

    public static Hungry getInstance()
    {
        return instance;
    }
}
