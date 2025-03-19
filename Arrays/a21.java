// similar to a20.java , just the change is that this time the i/p has been taken from the user. 

import java.util.Scanner;
public class a21 {
    public static void main(String[] args) {
        System.out.print("Enter the Number of rows and the columns : ");
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt(); // for rows
            int m = sc.nextInt(); // for col's
            
            int a[][] = new int [n][m];
            int b[][] = new int [n][m];
            int add[][] = new int[a.length][b.length]; 
            
            System.out.print("Enter the elements for the first array : ");
            for(int i = 0 ; i<n ; i++){
                for(int j = 0 ; j<m ;j++){
                    a[i][j] = sc.nextInt();
                }
            }

            System.out.print("Enter the elements for the second array : ");
            for(int i = 0 ; i<n ; i++){
                for(int j = 0 ; j<m ;j++){
                    b[i][j] = sc.nextInt();
                }
            }
            System.out.println("Addition of the two arrays: ");
            for(int i = 0 ; i<a.length;i++){
                for(int j = 0 ; j<b.length;j++){
                    add[i][j] = a[i][j] + b[i][j];
                    System.out.print(add[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
