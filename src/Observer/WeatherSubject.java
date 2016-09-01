package Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 目标对象,他知道观察他得观察者,并提供注册和删除观察者的接口
 *
 * @author NikoBelic
 * @create 20:48
 */
public class WeatherSubject
{
    private List<Observer> observers = new ArrayList<Observer>();
    //添加订阅天气的人
    public void attch(Observer observer)
    {
        observers.add(observer);
    }
    //删除指定订阅者
    public void detach(Observer observer)
    {
        observers.remove(observer);
    }
    //通知所有已经订阅的人
    protected void notifyObservers()
    {
        /*
            观察者模式的 拉模型,将Subject对象传给Observer,让它自己拉取需要的内容.
            推模型:直接将内容退给Observer的update方法.
         */
        for (Observer observer : observers)
        {
            observer.update(this);
        }
    }
}
