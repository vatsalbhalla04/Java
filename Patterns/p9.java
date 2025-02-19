// Write program to print 0 if number of row is odd and print 1 if number of row is even which is gradually increasing 
public class p9 {
    public static void main(String[] args) {
        int n = 5 ; 
        for(int i = 0 ; i<=n ; i++){
            for(int j = 0 ; j<i ; j++){
                if(i % 2 == 0 ) System.out.print("1");
                else System.out.print("0");
            }
            System.out.println();
        }
    }
}
