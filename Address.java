public class Address {
    private Long id;
    private User user;
    private String street;
    private String city;
    private String province;
    private String postalCode;
    private boolean isDefault;

    // Konstruktor
    public Address() {
    }

    public Address(Long id, User user, String street, String city, String province, String postalCode, boolean isDefault) {
        this.id = id;
        this.user = user;
        this.street = street;
        this.city = city;
        this.province = province;
        this.postalCode = postalCode;
        this.isDefault = isDefault;
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

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public boolean isDefault() {
        return isDefault;
    }

    public void setDefault(boolean aDefault) {
        isDefault = aDefault;
    }
}