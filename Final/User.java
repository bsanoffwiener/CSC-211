abstract class User {
    protected String username;

    public User(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }
}

class Customer extends User {
    public Customer(String username) {
        super(username);
    }
}

class Admin extends User {
    public Admin(String username) {
        super(username);
    }
}
