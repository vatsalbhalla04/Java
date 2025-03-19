//Prefix Matcher  or String Finder using the String method : startsWith.
import java.util.Scanner;

public class s7 {
    public static void main(String[] args) {
        String[] s = {
            "Hello world",
            "Python programming is fun",
            "ChatGPT is helpful",
            "How are you?",
            "Have a great day",
            "Programming is creative",
            "Learn Python with examples",
            "Stay safe and healthy",
            "Coding can be exciting",
            "Always keep learning"
        };
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the starting char : ");

        String first_char = sc.nextLine();

        boolean found = false ; 

        for(String str : s){
            if(str.startsWith(first_char)){
                System.out.println(str);
                found = true;
            }
        }
        if(!found) System.out.println("No strings found starting with the given sentence.");
    }
}
