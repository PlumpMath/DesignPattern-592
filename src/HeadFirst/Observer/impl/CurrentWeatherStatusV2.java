package HeadFirst.Observer.impl;

import HeadFirst.Observer.Display;

import java.util.Observable;
import java.util.Observer;

/**
 * JDK观察者模式
 * @author NikoBelic
 * @create 16/8/30 21:01
 */
public class CurrentWeatherStatusV2 implements Display, Observer
{
    private int temperature;
    Observable observable;

    public CurrentWeatherStatusV2(Observable observable) {
        this.observable = observable;
        this.observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg)
    {
        if (o instanceof WeatherDataV2)
        {
            WeatherDataV2 weatheDataV2 = (WeatherDataV2) o;
            this.temperature = weatheDataV2.getTemperature();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("观察者模式V2:现在的温度是" + this.temperature + "°");
    }
}
