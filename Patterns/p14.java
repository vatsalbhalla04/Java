// File: p14.java
// Print the up-side down pyramid : 
public class p21 {
    public static void main(String[] args) {
        int n = 5 ; 
       for(int i = 0 ; i<n ; i++){
        for(int j = 0 ; j<=i ; j++){
            System.out.print("-"); // printing spaces : "-"
        }
        for(int j = n ; j>i ; j--)
        {
            System.out.print("* ");
        }
        System.out.println();
       }
    }
}
