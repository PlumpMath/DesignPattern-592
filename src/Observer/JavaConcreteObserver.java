package Observer;

import java.util.Observable;

/**
 * Java自带观察者
 *
 * @author NikoBelic
 * @create 13:04
 */
public class JavaConcreteObserver implements java.util.Observer
{
    private String observerName;
    @Override
    public void update(Observable o, Object arg) {
        System.out.println(observerName + " 收到了推送的消息 " + arg);
        System.out.println(observerName + " 拉取消息 " + ((JavaConcreteWeatherSubject)o).getContent());
    }

    public String getObserverName() {
        return observerName;
    }

    public void setObserverName(String observerName) {
        this.observerName = observerName;
    }
}
