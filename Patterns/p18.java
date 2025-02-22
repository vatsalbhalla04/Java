// Write program to print 0 if number of column is odd and print digit of column  if number of column is even in upside donw manner.
public class p18 {
    public static void main(String[] args) {
        int n = 5 ; 
        for(int i = 0 ; i<=n ; i++){
            for(int j=n; j>= i ; j--){
                if(j % 2 == 0) System.out.print("1");
                else System.out.print("*");
            }
            System.out.println();
        }
    }
}
