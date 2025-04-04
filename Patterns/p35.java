// File: p35.java
// Print the pyramids side by side . 
public class p40 {
    public static void main(String[] args) {
        int n = 6; 

        for (int i = 0; i < n; i++) {
            // First upright pyramid
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            
            // Space between pyramids
            System.out.print("  ");
            
            // First upside-down pyramid
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n - i; j++) {
                System.out.print("* ");
            }
            
            // Space between pyramids
            System.out.print("  ");
            
            // Second upside-down pyramid
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n - i; j++) {
                System.out.print("* ");
            }
            
            // Space between pyramids
            System.out.print("  ");
            
            // Second upright pyramid
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            
            System.out.println();
        }
    }
}