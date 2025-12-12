public class Main {
    public static void main(String[] args) {
        // Inisialisasi repository
        UserRepository userRepository = new UserRepositoryImpl();
        UserService userService = new UserService(userRepository);

        // Register user
        User user = userService.registerUser("johndoe", "john@example.com", "password", "John Doe", "08123456789");
        System.out.println("User registered: " + user.getUsername());

        // Login
        User loggedInUser = userService.login("johndoe", "password");
        System.out.println("User logged in: " + loggedInUser.getFullName());
    }
}