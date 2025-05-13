import java.util.Arrays;
import java.util.List;

class User{
    String name;
    int age; 

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    @Override
    public String toString() {
        return name + " - " + age;
    }

}

public class oops52 {
    public static void main(String[] args) {
        
        List<User> users = Arrays.asList(
            new User("Vatsal", 20),
            new User("Raj", 21),
            new User("Yash", 19)
        );
        // ✅ 1. Print all names using method reference:
        users.stream().map(User::getName).forEach(System.out::println);

        // ✅ 2. Filter adults and print using lambda + method ref:
        users.stream().filter(u -> u.getAge() >=20).forEach(System.out::println);

        // ✅ 3. Convert names to uppercase using map:
        users.stream().map(User::getName).map(String::toUpperCase).forEach(System.out::println);
        
    }
}
