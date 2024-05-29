public class PrototypeRunner {
    public static void main(String[] args) {
        DatabaseConnection connection = new DatabaseConnection();
        connection.setHost("localhost");
        connection.setPort("3306");
        connection.setUsername("root");
        connection.setPassword("root");
        connection.setDatabase("prototype");
        connection.setUrl("jdbc:mysql://localhost:3306/prototype");
        connection.setDriver("com.mysql.cj.jdbc.Driver");
        connection.connect();
        System.out.println(connection);

        try {
            DatabaseConnection connection2 = connection.clone();
            System.out.println(connection2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
