//Reverse an Array in groups of given size
public class a27 {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int k = 3 ; 
        int n = a.length;
        for(int i = 0 ; i<=n ; i = i+k){
            for(int j=Math.min(i + k - 1 , n-1) ;j>=i ; j--){
            System.out.print(a[j]+" ");
           } 
        }
    }
}