//Print the Diagonals : 
public class a17 {
    public static void main(String[] args) {
        int a[][]={{1,2,3},
                   {4,5,6},
                   {7,8,9}};  

        int n = a.length; 
        for(int i = 0; i<n ;i++){
            for(int j = 0 ; j<n ; j++){
                if(i == j || i+j == n-1) System.out.print(a[i][j] + " ");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }   
}
