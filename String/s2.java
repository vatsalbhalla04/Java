//Print only the vowels from the name using the charAt(i)
public class s2 {
   public static void main(String[] args) {
         String name = "Vatsal";
         System.out.print("Vowels are : ");
         boolean vowelFound = false ; 
         for(int i = 0 ; i<name.length();i++){
            char c = name.charAt(i);

            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
            c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                System.out.print(" " + c);
                vowelFound = true;
            }
        }
        if(!vowelFound) System.out.println("No vowels present");
   } 
}
