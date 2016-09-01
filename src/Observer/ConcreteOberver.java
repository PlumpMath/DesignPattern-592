package Observer;

/**
 * 具体的观察者对象,实现更新的方法,使自身的状态和目标的状态保持一致
 *
 * @author NikoBelic
 * @create 20:51
 */
public class ConcreteOberver implements Observer
{
    //观察者的名字
    private String observerName;
    //天气内容
    private String weatherContent;

    private String remindThings;
    @Override
    public void update(WeatherSubject weatherSubject) {
        weatherContent = ((ConcreteWeatherSubject) weatherSubject).getWeatherContent();
        System.out.println(observerName + " 收到了 " + weatherContent + "," + remindThings);
    }

    public String getObserverName() {
        return observerName;
    }

    public void setObserverName(String observerName) {
        this.observerName = observerName;
    }

    public String getWeatherContent() {
        return weatherContent;
    }

    public void setWeatherContent(String weatherContent) {
        this.weatherContent = weatherContent;
    }

    public String getRemindThings() {
        return remindThings;
    }

    public void setRemindThings(String remindThings) {
        this.remindThings = remindThings;
    }
}
