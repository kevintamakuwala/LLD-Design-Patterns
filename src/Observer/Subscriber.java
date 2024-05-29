public class Subscriber implements Observer {
    private String name;

    public Subscriber(String name) {
        this.name = name;
    }
    @Override
    public void notified(String channelName, String title) {
        System.out.println("Hey " + name + ", New Video:" + title + " Uploaded by " + channelName);
    }
}
