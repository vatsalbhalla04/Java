// print the hollow pyramid : 
public class p28 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                if (i == 0 || i == n || j == 0 || j == i) System.out.print("* ");
                else System.out.print("  "); 
            }
            System.out.println();
        }
    }
}
