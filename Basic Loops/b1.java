// Arithmetic opts 
import java.util.Scanner;

public class b1 {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.print("Enter the number 1: ");
            int n1 = sc.nextInt();
            System.out.print("Enter the number 2: ");
            int n2 = sc.nextInt();
            
            System.out.println("Addition of n1 and n2 is " +  (n1+n2));
            System.out.println("Subtraction of n1 and n2 is " +  (n1-n2));
            System.out.println("Multiplication of n1 and n2 is " +  (n1*n2));
            System.out.println("Division  of n1 and n2 is "+  (n1/n2));

    }
}
