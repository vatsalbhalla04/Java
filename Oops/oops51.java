//Mapping & Collecting
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class oops51 {
    public static void main(String[] args) {
    List<String> names = Arrays.asList("Vatsal", "Raj", "Yash");

    List<String> upper = names.stream().map(String::toUpperCase).collect(Collectors.toList());

    System.out.println(upper);

    }
}
