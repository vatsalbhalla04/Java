// File: p02.java
// Write program to print 0 if number of column is odd and 1 if number of column even which is gradually increasing 
public class p10 {
    public static void main(String[] args) {
        int n = 5 ; 
        for(int i = 0 ; i<=n ; i++){
            for(int j = 0 ; j<i ; j++){
                if((j+1) % 2 == 0 ) System.out.print("1");
                else System.out.print("0");
            }
            System.out.println();
        }
    }
}
