//Write program to print star which is gradually increasing like staircase 

public class p2 {
    public static void main(String[] args) {
        int n = 5 ; 
        for(int i = 0 ; i<=n ; i++){
            for(int j = 0 ; j<i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
