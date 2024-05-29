
public class LazyRunner {
    public static void main(String[] args) {
        System.out.println("=====Lazy Initialization=====");
        LazyCacheService cacheService1 = LazyCacheService.getInstance();
        LazyCacheService cacheService2 = LazyCacheService.getInstance();
        System.out.println(cacheService1.hashCode());
        System.out.println(cacheService2.hashCode());
    }
}
