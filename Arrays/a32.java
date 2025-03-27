// Remove duplicates from Sorted Array
// https://chatgpt.com/c/67cedf23-1df0-800f-a154-81cc28a446f9
public class a32 {
    public static void main(String[] args) {
        int a[] = {10, 20, 20, 20, 30, 30, 40};
        int duplicate[] = new int[a.length];
        int unique[] = new int[a.length];
        int duplicateindex = 0;
        int uniqueindex = 0;
        int count;

        for (int i = 0; i < a.length; i++) {
            count = 0;
            duplicate[duplicateindex] = a[i];  // Storing elements in duplicate array

            for (int j = 0; j <= duplicateindex; j++) {  
                if (duplicate[j] == a[i]) {
                    count++;
                }
            }

            if (count == 1) {
                unique[uniqueindex++] = duplicate[duplicateindex];
            }
            duplicateindex++;
        }

        // Printing unique elements
        for (int i = 0; i < uniqueindex; i++) {
            System.out.print(unique[i] + " ");
        }
    }
}
