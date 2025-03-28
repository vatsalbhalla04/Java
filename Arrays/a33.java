// Insert an adjacent duplicate for all occurrences of a given element :  
    /* The length of the array should remain the same by shifting elements and removing the last ones as needed.  
    Duplicate elements should be placed adjacent to the original occurrences  */

//https://chatgpt.com/c/67cee894-cdbc-800f-8638-f8cb2c4736cd

import java.util.Arrays;

public class a33 {
    public static void main(String[] args) {
        int arr[] = {1, 0, 2, 3, 0, 4, 5, 0}; 
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                // Shift elements right
                for (int j = n - 1; j > i; j--) {
                    arr[j] = arr[j - 1];
                }
                i++; // Skip next index
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
    
