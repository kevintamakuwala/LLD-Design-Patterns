public class BuilderRunner {
    public static void main(String[] args) {
        User user = User.UserBuilder.builder()
                .setId("1")
                .setName("John")
                .setEmail("John@gmail.com").build();
        System.out.println(user);
    }
}
