// Write program to make pyramid of digit:
public class p37 {
    public static void main(String[] args) {
        int n = 5; // Adjusted to match the required pattern
        
        for (int i = 1; i <= n; i++) {
            // Printing leading spaces for pyramid alignment
            for (int k = 1; k <= n - i; k++) {
                System.out.print(" ");
            }
            
            // Printing increasing numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            
            // Printing decreasing numbers
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }
            
            System.out.println();
        }
    }
}
