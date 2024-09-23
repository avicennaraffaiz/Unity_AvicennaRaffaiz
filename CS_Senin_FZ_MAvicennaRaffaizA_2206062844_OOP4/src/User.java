public class User {
    public String name;
    public String userId;

    public User(String name, String userId) {
        this.name = name;
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "User Name: " + name + "\nID :" + userId;
    }
}
