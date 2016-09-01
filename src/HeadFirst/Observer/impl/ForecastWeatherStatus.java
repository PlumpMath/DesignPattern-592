package HeadFirst.Observer.impl;

import HeadFirst.Observer.Display;
import HeadFirst.Observer.Observer;
import HeadFirst.Observer.Subject;

/**
 * @author NikoBelic
 * @create 16/8/30 19:05
 */
public class ForecastWeatherStatus implements Observer,Display
{
    private String msg = "";
    private Subject weatherData;

    public ForecastWeatherStatus(Subject weatherData) {
        this.weatherData = weatherData;
        this.weatherData.registObserver(this);
    }

    @Override
    public void display() {
        System.out.println(msg);
    }

    @Override
    public void update(int temperature, int wet, int pressure) {
        msg = "";
        if (temperature > 35)
            msg += "妈的太热了,明天估计也挺热的...\n";
        if (wet > 80 )
            msg += "我靠,这么潮,洗澡一样啊...\n";
        if (pressure > 1000)
            msg += "兄弟,压力有点大啊...\n";
        display();
    }
}
