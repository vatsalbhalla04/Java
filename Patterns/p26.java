// print hollow upside-down pyramid : 
public class p26 {
    public static void main(String[] args) {
        int n = 9 ; 
        for(int i = 0 ; i<= n ; i++){
            for(int j = 0 ; j<i ; j++){
                System.out.print(" ");
            }
            for(int j = 0; j < (n-i); j++) {
                if(j == 0 || j == (n-i)-1 || i == 0 ) System.out.print("* ");
                else  System.out.print("  ");   
            }
            System.out.println();
        }
    }
}
