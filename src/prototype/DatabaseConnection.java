public class DatabaseConnection implements Cloneable {
    private String host;
    private String port;
    private String username;
    private String password;
    private String database;
    private String url;
    private String driver;

    public void connect() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Database Connection done");
    }

    @Override
    public String toString() {
        return "{" +
                " host='" + getHost() + "'" +
                ", port='" + getPort() + "'" +
                ", username='" + getUsername() + "'" +
                ", password='" + getPassword() + "'" +
                ", database='" + getDatabase() + "'" +
                ", url='" + getUrl() + "'" +
                ", driver='" + getDriver() + "'" +
                "}";
    }

    public String getHost() {
        return this.host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getPort() {
        return this.port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDatabase() {
        return this.database;
    }

    public void setDatabase(String database) {
        this.database = database;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDriver() {
        return this.driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    @Override
    public DatabaseConnection clone() throws CloneNotSupportedException {
        return (DatabaseConnection) super.clone();
    }
}