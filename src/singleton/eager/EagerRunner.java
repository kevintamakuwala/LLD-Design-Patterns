public class EagerRunner {
    public static void main(String[] args) {
        System.out.println("=====Eager Initialization=====");
        EagerCacheService cacheService1 = EagerCacheService.getInstance();
        EagerCacheService cacheService2 = EagerCacheService.getInstance();
        System.out.println(cacheService1.hashCode());
        System.out.println(cacheService2.hashCode());
    }
}
