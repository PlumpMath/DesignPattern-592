package HeadFirst.Observer;

import HeadFirst.Observer.impl.*;

/**
 * @author NikoBelic
 * @create 16/8/30 19:01
 */
public class Test
{
    public static void main(String[] args)
    {
        // 观察者模式 V1
        /*
        WeatherData weatherData = new WeatherData();
        CurrentWeatherStatus currentWeatherStatus = new CurrentWeatherStatus(weatherData);
        ForecastWeatherStatus forecastWeatherStatus = new ForecastWeatherStatus(weatherData);
        weatherData.setMessurement(35,60,1010);
        System.out.println("======= 若干年以后 ========");
        weatherData.setMessurement(45,85,2000);
        */
        // 观察者模式V2
        WeatherDataV2 weatherDataV2 = new WeatherDataV2();
        CurrentWeatherStatusV2 currentWeatherStatusV2 = new CurrentWeatherStatusV2(weatherDataV2);
        weatherDataV2.setMesurement(38,80,1000);
        weatherDataV2.setMesurement(40,80,1000);
    }
}
