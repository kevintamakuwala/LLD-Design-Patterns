
class SyncCacheService implements Cloneable{
    private static SyncCacheService instance;

    private SyncCacheService() {
    }

    public static SyncCacheService getInstance() {
        if (instance == null) {
            synchronized (SyncCacheService.class) {
                if (instance == null)
                    instance = new SyncCacheService();
            }
        }
        return instance;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException{
        return instance;
    }
}
