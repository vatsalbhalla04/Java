// To the sum of both even num and odd num from an array 
public class a6 {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 14, 13, 256, 89 };
        int even = arr[0];
        int odd = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0)
                even += arr[i];
            else
                odd += arr[i];
        }
        System.out.println("The sum of even numbers is : " + even);
        System.out.println("The sum of odd numbers is : " + odd);
    }
}
