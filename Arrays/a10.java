// Array Insertion with shifting
import java.util.Scanner;

public class a10 {
    
    @SuppressWarnings("ConvertToTryWithResources")
    public static void insertion(int[] a, int n) {
        Scanner sc = new Scanner(System.in);
        
        // Inserting values into the array
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the values:");
            a[i] = sc.nextInt();
        }
        
        // Position input
        System.out.print("Enter the position to add the element (between 1 to " + (n) + "):");
        int pos = sc.nextInt();
        
        // Ensuring position is valid
        if (pos < 1 || pos > n + 1) {
            System.out.println("Invalid position! Please enter a valid position.");
        }
        
        // Value input
        System.out.print("Enter the value to be inserted inside the array:");
        int value = sc.nextInt();
        
        // Shifting elements to make space
        for (int i = n; i >= pos; i--) {
            a[i] = a[i - 1];
        }
        
        a[pos - 1] = value; 
        n  = n + 1 ; 

        // Printing the new array
        System.out.println("New Array Values:");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        
        sc.close();
    }

    public static void main(String[] args) {
        int[] a = new int[100];
        int n = 10; 

        insertion(a, n);
    }
}
