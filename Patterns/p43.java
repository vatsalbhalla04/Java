//Right-Aligned Descending Number Pyramid
public class p43 {
    public static void main(String[] args) {
        int n = 4; // Adjusted to match expected pattern

        for (int i = 0; i < n; i++) {
            // Print leading spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            // Print numbers in decreasing order
            for (int j = n; j > i; j--) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }
}
