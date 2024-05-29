class LazyCacheService implements Cloneable{
    private static LazyCacheService instance;
    private LazyCacheService() {
    }
    public static LazyCacheService getInstance() {
        if (instance == null)
            instance = new LazyCacheService();
        return instance;
    }
    @Override
    protected Object clone() throws CloneNotSupportedException{
        return instance;
    }
}
