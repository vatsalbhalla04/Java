// print and store only the prime number values of an array into another
public class a15 {
    public static void main(String[] args) {
        int[] a = { 21, 53, 99, 9, 67, 66, 2, 91 };
        int prime[] = new int[a.length];
        int index = 0;

        for (int i = 0; i < a.length; i++) {
            int num = a[i];
            int count = 0;

            for (int j = 1; j <= num; j++) {
                if (num % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                prime[index++] = num;
            }
        }
        System.out.print("Prime numbers are : ");
        for (int i = 0; i < index; i++) {
            System.out.print(prime[i] + " ");
        }
    }
}