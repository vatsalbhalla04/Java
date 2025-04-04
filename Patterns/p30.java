// File: p30.java
//Write program to print alternate digit and alphabets
public class p36 {
   public static void main(String[] args) {
        int n = 5 ; 
        char ch = 'a';
        for(int i = 0 ; i<=n ; i++){
            for(int j = 0 ; j<=i ; j++){
                if(i % 2 == 0 ) {
                    System.out.print(ch);
                    ch++;
                }
                else System.out.print(j);
            }
            System.out.println();
        }
   } 
}
