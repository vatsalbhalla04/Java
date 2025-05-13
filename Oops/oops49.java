import java.util.Arrays;
import java.util.List;

@FunctionalInterface
interface UserFilter {
    boolean filter(User user);
    // User → is the class name
    // user → the instance of the User class
}

class User {
    String name;
    int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class oops49 {
    public static void main(String[] args) {
        List<User> u = Arrays.asList(
         new User("Vatsal", 20),
            new User("Yash", 30),
            new User("Raj", 15)        
        );
        UserFilter adultfilter = user -> user.age >= 18;

        u.stream()
         .filter(adultfilter::filter) // <-- correct method reference to filter method
         .forEach(user -> System.out.println(user.name + " is an adult"));
    }
}
