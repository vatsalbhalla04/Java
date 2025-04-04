// File: p41.java
// Write program to print 1 if number of column is odd and 0 if number of column is even --> sqaure pattern .
public class p5 {
    public static void main(String[] args) {
        int n = 6; // Number of columns
        
        // If the counting starts from 1 : 
        // for(int i = 1; i < n; i++) { 
        //     for(int j = 1; j < n; j++) { 
        //     if (j % 2 == 0) System.out.print("0");
        //     else System.out.print("1");
        //     }
        //     System.out.println();
        // }

        // If the counting starts from 0 : 
        for(int i = 0; i < n; i++) { // Loop for rows
            for(int j = 0; j < n; j++) { // Loop for columns
                if ((j + 1) % 2 == 0) // Check if column number is even
                    System.out.print("0");
                else 
                    System.out.print("1");
            }
            System.out.println();
        }
    }
}
