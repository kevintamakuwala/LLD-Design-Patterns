public class ObserverRunner {
    public static void main(String[] args) {
        Subject channel = new Channel("Kevin's Channel");
        
        Observer subscriber1 = new Subscriber("John");
        Observer subscriber2 = new Subscriber("Doe");

        channel.subscribe(subscriber1);
        channel.subscribe(subscriber2);

        channel.notifyObservers("Java Course");

        channel.unsubscribe(subscriber2);

        channel.notifyObservers("DSA Course");
    }
}
