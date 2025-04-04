// File: p42.java
// Write program to print 1 if number of column is odd and 0 if number of column 
// is even ---> Triangle Pattern .
public class p6 {
    public static void main(String[] args) {
        int n = 6 ; 
        for(int i = 0 ; i<=n ;i++){
            for(int j = 0 ; j<i ; j++){
                if((j+1) % 2 == 0) System.out.print("0");
                else System.out.print("1");
            }
            System.out.println();
        }
    }
}
