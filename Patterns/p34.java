// Writ program to print small alphabet in gradually increasing order :
public class p34 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((char) (j + 97) + " "); // Corrected ASCII conversion
            }
            System.out.println();
        }
    }
}
              
            
