public class re3 {
    public static boolean isPrime(int n, int i) {
        if (n <= 1) {
            return false; // 0 and 1 are not prime
        }
        if (i == 1) {
            return true; // If we reach 1, it's prime
        }
        if (n % i == 0) {
            return false; // If divisible, it's not prime
        }
        return isPrime(n, i - 1); // Check for next divisor
    }

    public static void main(String[] args) {
        int n = 17; // Change this number to check for other values
        boolean result = isPrime(n, n / 2);
        System.out.println(n + " is prime: " + result);
    }
}
