// Merger two arrays and sort them 
import java.util.Arrays;

public class a9 {
    public static void main(String[] args) {
        int a1[] = {10, 23, 45};
        int a2[] = {23, 46, 7};

        // Merge the two arrays using there length
        int arr[] = new int[a1.length + a2.length]; 
        //Create a new array arr with a size equal to the sum of the lengths of a1 and a2.
        //new int[size] dynamically allocates an array of integers.

        // Merging arrays : 
        System.arraycopy(a1, 0, arr, 0, a1.length);
        System.arraycopy(a2, 0, arr, a1.length, a2.length);

        //Alternative : 
        // for (int i = 0; i < a1.length; i++) {
        //     arr[i] = a1[i];
        // }
        // for (int i = 0; i < a2.length; i++) {
        //     arr[a1.length + i] = a2[i];
        // }

        // Sort the array :
        Arrays.sort(arr);

        System.out.print("Merged Sorted Array : ");
        for(int i =  0 ; i<arr.length; i++){
            System.out.print(+arr[i]+ " ");
        }
    }
}
