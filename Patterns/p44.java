public class p44 {
    public static void main(String[] args) {
        int n = 5 ;
        int k = n ; 
        for(int i = 0 ; i<=n ; i++){
            for(int j = 0 ; j<=i ; j++){
                System.out.print(" ");
            }
            for(int j = n ; j>=i ; j--){
                System.out.print(k+ " ");
            }
            k--;
            System.out.println();
        }
    }
}
