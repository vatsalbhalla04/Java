// Leaders in an array : leader in an array is an element that has no greater number to its right
// https://chatgpt.com/c/67cee894-cdbc-800f-8638-f8cb2c4736cd
public class a34 {
    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2, 3, 4, 5, 90, 3, 5, 4};
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int j;
            for (j = i + 1; j < n; j++) {
                if (arr[i] < arr[j]) break; // If a larger element is found, stop
            }
            if (j == n) System.out.print(arr[i] + " "); // Print leader directly
        }
        System.out.println();
    }
}
