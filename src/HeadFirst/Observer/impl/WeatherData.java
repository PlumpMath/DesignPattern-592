package HeadFirst.Observer.impl;

import HeadFirst.Observer.Observer;
import HeadFirst.Observer.Subject;

import java.util.ArrayList;

/**
 * 主题:气象站
 *
 * @author NikoBelic
 * @create 16/8/30 18:49
 */
public class WeatherData implements Subject
{
    private int temperature;
    private int wet;
    private int pressure;
    private ArrayList<Observer> observers;

    public WeatherData()
    {
        observers = new ArrayList<>();
    }

    @Override
    public void registObserver(Observer observer)
    {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer)
    {
        if (observers.indexOf(observer) >= 0)
            observers.remove(observer);
    }

    @Override
    public void notifyObserver()
    {
        for (Observer observer : observers)
        {
            observer.update(temperature,wet,pressure);
        }
    }

    public void measurementChanged()
    {
        notifyObserver();
    }
    public void setMessurement(int temperature,int wet,int pressure)
    {
        this.temperature = temperature;
        this.wet = wet;
        this.pressure = pressure;
        measurementChanged();
    }
}
