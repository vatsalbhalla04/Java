// File: p32.java
public class p38 {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 0; i < n; i++) {
            // Printing leading spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            // Printing left side stars
            for (int j = 0; j < n - i; j++) {
                System.out.print("* ");
            }

            // Printing spaces in the middle
            for (int j = 0; j < 2 * i; j++) {
                System.out.print(" ");
            }

            // Printing right side stars
            for (int j = 0; j < n - i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
