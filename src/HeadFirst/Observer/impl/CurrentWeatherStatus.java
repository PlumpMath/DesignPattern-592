package HeadFirst.Observer.impl;

import HeadFirst.Observer.Display;
import HeadFirst.Observer.Observer;
import HeadFirst.Observer.Subject;

/**
 * 订阅者:当前天气状态
 * @author NikoBelic
 * @create 16/8/30 18:56
 */
public class CurrentWeatherStatus implements Observer,Display
{
    private int temperature;
    private int wet;
    private int pressure;
    private Subject weatherData;

    public CurrentWeatherStatus(Subject weatherData) {
        this.weatherData = weatherData;
        this.weatherData.registObserver(this);
    }

    @Override
    public void update(int temperature, int wet, int pressure) {
        this.temperature = temperature;
        this.wet = wet;
        this.pressure = pressure;
        this.display();
    }
    @Override
    public void display() {
        System.out.println("Observer-" + this.getClass().getSimpleName());
        System.out.println("Temperature:" + this.temperature);
        System.out.println("Wet:" + this.wet);
        System.out.println("Pressure:" + this.pressure);
    }
}
