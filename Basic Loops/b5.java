
import java.util.Scanner;

// Factorial number 
public class b5 {
    @SuppressWarnings({ "resource"})
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int fact = 1 ; 
    for(int i = 1 ; i<=n ; i++){
        fact = fact*i; 
    }
     System.out.println(fact);   
    }
}
