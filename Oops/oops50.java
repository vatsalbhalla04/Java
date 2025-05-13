// Basic: Filtering & Printing
import java.util.Arrays;
import java.util.List;

public class oops50 {

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);
        nums.stream()
             .filter(n -> n % 2 == 0)
             .forEach(System.out::println);//Use method reference only when your lambda is simply calling an existing method.
    }
}
