// Print the Mirrored Right Angled Traingle. 
public class p19 {
    public static void main(String[] args) {
        int n = 5 ; 
       for(int i = 0 ; i<n ; i++){
        for(int j = n ; j>=i ; j--){
            System.out.print("-"); // printing spaces : "-"
        }
        for(int j = 0 ; j<=i ; j++){
            System.out.print("*");
        }
        System.out.println();
       }
    }
}
