// File: p23.java
//  Write program to print 1 if number of row is even and 0 if number of row odd -- Sqaure Pattern 
public class p3 {
    public static void main(String[] args) {
        int n = 5 ; 
        for(int i = 0 ; i<=n ; i++){
            for(int j = 0 ; j<=n ; j++){
                if(i % 2 == 0) System.out.print("1");
                else System.out.print("0");
            }
            System.out.println();
        }
    }
}
