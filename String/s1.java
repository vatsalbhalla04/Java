// charAt(i).
public class s1{
    public static void main(String args[]){
        String name = "vatsal";
        int x = name.length();
        System.out.println(x);
        for(int i = 0 ; i<x ; i++){
            char character = name.charAt(i);
            System.out.print(character + " ");
        }
    }
}