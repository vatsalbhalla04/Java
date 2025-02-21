// Write program to print digit which is gradually decreasing like upside-downstairs -->  
public class p15 {
    public static void main(String[] args) {
        int n = 5 ; 
       for(int i = 1 ; i<= n ; i++){
        int k=1;
        for(int j = n ; j>=i ; j--){
            System.out.print(k);
            k++;
        }
        System.out.println();
       }
    }
}
