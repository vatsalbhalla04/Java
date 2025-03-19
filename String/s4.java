
import java.util.Scanner;

//check whether the string is palindrome or not 
public class s4 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String c = sc.nextLine();
        boolean isPalindrome = true;

        for (int i = 0; i < c.length(); i++) {
            if (c.charAt(i) != c.charAt(c.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("It's a palindromic string");
        } else {
            System.out.println("It's not a palindromic string");
        }
    }
}

