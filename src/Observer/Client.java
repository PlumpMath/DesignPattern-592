package Observer;

import org.junit.Test;

/**
 * @author NikoBelic
 * @create 11:25
 */
public class Client
{
    /**
     * 测试JDK自带的观察者模式
     * 只需要自己创建Subject的实现和Observer的实现就可以了 ,不需要创建接口,直接继承和实现JDK的接口就可以了
     * 非常方便
     */
    @Test
    public void javaOberverTest()
    {
        JavaConcreteWeatherSubject weatherSubject = new JavaConcreteWeatherSubject();

        JavaConcreteObserver mom = new JavaConcreteObserver();
        mom.setObserverName("妈妈");

        weatherSubject.addObserver(mom);
        weatherSubject.setContent("今天有点冷");
    }
    public static void main(String[] args)
    {
        //创建目标
        ConcreteWeatherSubject weather = new ConcreteWeatherSubject();
        //创建观察者
        ConcreteOberver mom = new ConcreteOberver();
        mom.setObserverName("老娘");
        mom.setRemindThings("买东西呀");

        ConcreteOberver girl = new ConcreteOberver();
        girl.setObserverName("女票");
        girl.setRemindThings("约会");

        //注册观察者
        weather.attch(mom);
        weather.attch(girl);
        //发布信息
        weather.setWeatherContent("天气晴朗");
    }
}
