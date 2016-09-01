package Observer;

/**
 * 观察者接口,定义一个更新的接口给那些在目标发生改变的时候被通知的对象
 *
 * @author NikoBelic
 * @create 20:50
 */
public interface Observer
{
    public void update(WeatherSubject weatherSubject);
}
