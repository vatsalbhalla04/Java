public class s6 {
public static void main(String[] args) {
    String s = "Hey";
    for(int i = 0 ; i<s.length();i++){
        char c = s.charAt(i);
        System.out.println(c + ":" + (int)c);
    }
    // s.charAt(i) → Gets the character at index i.
    // (int) c → Casts thecharacter to its ASCII value.
}
}
