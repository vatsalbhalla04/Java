// print the table using the do while loop
import java.util.Scanner;

public class b6 {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1 ; 
        do { 
        System.out.println(n+" * "+i+" = "+ n*i );
        i++;
        } while (i<=10);
    }
}
