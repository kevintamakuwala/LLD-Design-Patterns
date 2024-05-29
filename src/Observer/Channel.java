import java.util.List;
import java.util.ArrayList;

public class Channel implements Subject {
    List<Observer> subscribers = new ArrayList<>();
    String channelName;

    public Channel(String channelName) {
        this.channelName = channelName;
    }

    @Override
    public void subscribe(Observer observer) {
        subscribers.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
        subscribers.remove(observer);
    }

    @Override
    public void notifyObservers(String title) {
        System.out.println("====== " + channelName + " uploaded New Video ======");
        for (Observer observer : subscribers) {
            observer.notified(channelName, title);
        }
    }
}
