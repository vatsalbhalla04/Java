// Write program to print same number which is gradually increasing --> row vise 
public class p7 {
    public static void main(String[] args) {
        int n = 5;
        for(int i = 0 ; i<=n ; i++){
            for(int j = 0  ; j<i ; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
