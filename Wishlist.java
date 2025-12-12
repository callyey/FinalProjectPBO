import java.time.LocalDateTime;

public class Wishlist {
    private Long id;
    private User user;
    private Product product;
    private LocalDateTime addedAt;

    // Konstruktor
    public Wishlist() {
    }

    public Wishlist(Long id, User user, Product product) {
        this.id = id;
        this.user = user;
        this.product = product;
        this.addedAt = LocalDateTime.now();
    }

    // Getter dan Setter
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public LocalDateTime getAddedAt() {
        return addedAt;
    }

    public void setAddedAt(LocalDateTime addedAt) {
        this.addedAt = addedAt;
    }
}