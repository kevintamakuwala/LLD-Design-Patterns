class EagerCacheService implements Cloneable{
    private static final EagerCacheService instance = new EagerCacheService();

    private EagerCacheService() {
    }

    public static EagerCacheService getInstance() {
        return instance;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return instance;
    }
}
