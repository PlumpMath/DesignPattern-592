package HeadFirst.Observer.impl;

import java.util.Observable;

/**
 * 使用JDK的观察者模式接口
 * @author NikoBelic
 * @create 16/8/30 20:56
 */
public class WeatherDataV2 extends Observable
{
    private int temperature;
    private int wet;
    private int pressure;

    public void setMesurement(int t,int w,int p)
    {
        this.temperature = t;
        this.wet = w;
        this.pressure = p;
        this.mesuremenChanged();
    }

    public void mesuremenChanged()
    {
        setChanged();
        notifyObservers();
    }

    public int getTemperature() {
        return temperature;
    }

    public int getWet() {
        return wet;
    }

    public int getPressure() {
        return pressure;
    }
}
