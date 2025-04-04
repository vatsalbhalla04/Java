// File: p22.java
// Print the K full of stars : 
public class p29 {
    public static void main(String[] args) {
        int n = 5 ; 
        for(int i = 0 ; i<=n ; i++){
            for(int j = n ; j>=i ; j--){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 1 ; i<= n ; i++){
            for(int j = 0 ; j<=i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
