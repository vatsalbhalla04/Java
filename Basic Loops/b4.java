//Prime numbers
import java.util.Scanner;

public class b4 {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        int count = 0 ; 
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1 ; i<=n ; i++){
            if(n%i==0) count++ ;
    }
    if(count == 2 )  System.out.println(n + " it is a prime number");
    else System.out.println(n + " it's a composite Number");
}
}