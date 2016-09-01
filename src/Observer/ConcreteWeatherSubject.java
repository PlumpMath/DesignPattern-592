package Observer;

/**
 * 具体的目标对象,负责把有关对象存入到相应的观察者对象
 *
 * @author NikoBelic
 * @create 20:50
 */
public class ConcreteWeatherSubject extends WeatherSubject
{
    private String weatherContent;

    public String getWeatherContent() {
        return weatherContent;
    }

    public void setWeatherContent(String weatherContent) {
        this.weatherContent = weatherContent;
        notifyObservers();
    }
}
