// File: p04.java
//6 Write program to print digit which is gradually decreasing like upside-down stairs 
public class p12 {
    public static void main(String[] args) {
        int n = 5 ; 
        for(int i = 1 ; i<=n ; i++){
            for(int j=n ; j>=i ; j--){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
