import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class BorrowerRegistry extends LibraryCollection<User>{
    public BorrowerRegistry() {
        super();
    }

    public List<User> findByName(String name) {
        return getAllItems().stream().filter(user -> user.name.toLowerCase()
                .contains(name.toLowerCase())).collect(Collectors.toList());
    }

    public User findByUserId(String userId) {
        Optional<User> user = getAllItems().stream().
                filter(u -> u.userId.equals(userId)).findFirst();
        return user.orElse(null);
    }
}
