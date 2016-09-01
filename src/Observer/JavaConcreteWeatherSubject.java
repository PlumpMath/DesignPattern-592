package Observer;

import javafx.beans.InvalidationListener;

import java.util.Observable;

/**
 * Java自带的观察者模式
 *
 * @author NikoBelic
 * @create 12:55
 */
public class JavaConcreteWeatherSubject extends Observable
{
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;

        this.setChanged();
        //推方式
        this.notifyObservers(content );
        //拉方式
        //this.notifyObservers();
    }
}
