package Singleton;

/**
 * 懒汉是
 * 特点:加载快,获取慢
 * @author NikoBelic
 * @create 20:07
 */
public class Lazy
{
    private static Lazy instance;
    private Lazy(){}
    public static Lazy getInstance()
    {
        if (instance == null)
            instance = new Lazy();
        return instance;
    }
}
