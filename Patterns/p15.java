// File: p15.java
// Diamond Pattern : 
public class p22 {
    public static void main(String[] args) {
            int n = 5 ; 
            // Pyramid : 
            for(int i = 0 ; i<=n ; i++){
                for(int j = n  ; j>=i ; j--){
                    System.out.print(" ");
                }
                for(int j = 0 ; j<=i ; j++){
                    System.out.print("* ");
                }
                System.out.println();
            }
            // Upside-down pyramid : 
            for(int i = 0 ; i<n ; i++){
                for(int j = 0 ; j<=i ; j++){
                    System.out.print(" "); // printing spaces : "-"
                }
                for(int j = n ; j>i ; j--)
                {
                    System.out.print(" *");
                }
                System.out.println();
        }
    }
}
