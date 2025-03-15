// Array deletion

import java.util.Scanner;
public class a11 {
    public static void deletion(int n, int[] a) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        // Input array values
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the value:");
            a[i] = sc.nextInt();
        }

        // Ask for deletion position
        System.out.println("Enter the position to delete the value (between 1 to " + n + "):");
        int pos = sc.nextInt();

        // Ensure position is valid
        if (pos < 1 || pos > n) {
            System.out.println("Invalid position! Please enter a valid position.");
            return;
        }

        // Shift elements to delete the value
        for (int i = pos - 1; i < n - 1; i++) {
            a[i] = a[i + 1];
        }

        n--; // Reduce size after deletion

        // Print the updated array
        System.out.println("New Array Values:");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] a = new int[100];
        int n = 5;

        deletion(n, a); 
    }
}
