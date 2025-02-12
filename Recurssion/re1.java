public class re1{
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    public static void main(String[] args) {
        int n = 10; // Change this value to compute Fibonacci for a different number
        System.out.println("Fibonacci of " + n + " is: " + fibonacci(n));
    }
}