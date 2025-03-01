// Writ program to print Captial alphabet in gradually increasing order :
public class p35 {
    public static void main(String[] args) {
        int n = 5;  
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((char) (j + 65) + " ");  // Correct ASCII conversion
            }
            System.out.println();
        }
    }
}
