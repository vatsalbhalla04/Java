// File: p37.java
//Inverted Right Number Pyramid
public class p42 {
    public static void main(String[] args) {
        int n = 4; // Number of rows

        for (int i = 0; i < n; i++) {
            // Printing leading spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            // Printing numbers in decreasing order
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }
}
