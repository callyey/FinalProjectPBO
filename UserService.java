import java.util.List;

public class UserService {
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User registerUser(String username, String email, String password, String fullName, String phoneNumber) {
        // Cek apakah username atau email sudah terdaftar
        if (userRepository.findByUsername(username) != null) {
            throw new RuntimeException("Username already exists");
        }
        if (userRepository.findByEmail(email) != null) {
            throw new RuntimeException("Email already exists");
        }

        User user = new User();
        user.setUsername(username);
        user.setEmail(email);
        user.setPassword(password); // Dalam aplikasi nyata, password harus di-hash
        user.setFullName(fullName);
        user.setPhoneNumber(phoneNumber);
        user.setRole(Role.CUSTOMER);

        return userRepository.save(user);
    }

    public User login(String username, String password) {
        User user = userRepository.findByUsername(username);
        if (user == null) {
            user = userRepository.findByEmail(username);
        }

        if (user != null && user.getPassword().equals(password)) {
            return user;
        }
        throw new RuntimeException("Invalid username/email or password");
    }

    public User getUserById(Long id) {
        return userRepository.findById(id);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User updateUser(Long id, String fullName, String phoneNumber) {
        User user = userRepository.findById(id);
        if (user != null) {
            user.setFullName(fullName);
            user.setPhoneNumber(phoneNumber);
            user.setUpdatedAt(java.time.LocalDateTime.now());
            userRepository.save(user);
        }
        return user;
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}