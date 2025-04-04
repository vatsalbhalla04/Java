// Print even and odd numbers
public class a4 {
    public static void main(String[] args) {
        int arr[] = { 10, 34, 56, 32, 55, 9, 21, 31, 45, 77, 13, 56 };
        System.out.print("Even Numbers are: ");
        for (int x : arr) {
            if (x % 2 == 0) System.out.print(x + " ");
        }
      
        System.out.print("\n Odd Numbers are: ");
        for (int x : arr) {
            if (x % 2 != 0) System.out.print(x + " ");
        }
    }
}
