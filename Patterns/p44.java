// File: p44.java
//Write program to print number which is gradually increasing --> column vise : 
public class p8 {
    public static void main(String[] args) {
        int n = 5 ; 
        for(int i = 1 ; i<=n ; i++){
            for(int j = 1 ; j<i ; j++){
                System.out.print(j);
            }
            System.out.println(i);
        }
    }
}
