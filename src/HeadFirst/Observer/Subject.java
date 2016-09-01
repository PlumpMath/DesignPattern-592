package HeadFirst.Observer;

/**
 * 主题接口
 * Created by NikoBelic on 16/8/30.
 */
public interface Subject
{
    void registObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObserver();
}
