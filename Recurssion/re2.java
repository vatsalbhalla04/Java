public class re2 {
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1; // Base case
        }
        return n * factorial(n - 1); // Recursive case
    }

    public static void main(String[] args) {
        int n = 5; // Change this value for a different factorial calculation
        System.out.println("Factorial of " + n + " is: " + factorial(n));
    }
}
