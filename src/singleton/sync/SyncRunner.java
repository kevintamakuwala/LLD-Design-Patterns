
public class SyncRunner implements Runnable {
    @Override
    public void run() {
        SyncCacheService cacheService = SyncCacheService.getInstance();
        System.out.println(cacheService.hashCode());
    }

    public static void main(String[] args) {
        SyncRunner runner = new SyncRunner();
        System.out.println("=====Starting threads=====");
        Thread th1 = new Thread(runner);
        Thread th2 = new Thread(runner);
        th1.start();
        th2.start();
    }
}
