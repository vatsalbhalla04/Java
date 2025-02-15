// Greatest of the two 
import java.util.Scanner;

public class b2 {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        if(n1 > n2 ) System.out.println( "N1 is the Greatest");
        else System.out.println( "N2 is the Greatest");
    }
}
