// File: p05.java
//Write program to print 0 if column is even and 1 if column is odd which is gradually decreasing  
public class p13 {
    public static void main(String[] args) {
        int n  = 5 ; 
        for(int i = 0 ; i<=n  ;i++){
            for(int j=n ; j>=i ; j--){
                if(j % 2 == 0 )System.out.print("0");
                else System.out.print("1");
            }
            System.out.println();
        }
    }
}
