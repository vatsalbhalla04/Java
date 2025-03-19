//Prefix Matcher  or String Finder using the String method : contains.
import java.util.Scanner;

public class s8 {
    @SuppressWarnings("ConvertToTryWithResources")
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
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the starting char: ");
        String characters = sc.nextLine();

        boolean found = false;

        for (String str : s) {
            if (str.contains(characters)) {
                System.out.println(str);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No strings contain the word.");
        }

        sc.close();
    }
}


