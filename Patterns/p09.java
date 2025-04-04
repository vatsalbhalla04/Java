// File: p09.java
// Write program to print * if number of row is odd and print digit of row if number of row is even.
public class p17 {
    public static void main(String[] args) {
        int n = 5 ; 
        for(int i = 1 ; i<=n ; i++){
            for(int j=n ; j>i ; j--){
                if(i % 2 == 0 ) System.out.print(i);
                else System.out.print("*");
            }
            System.out.println();
        }
    }
}
