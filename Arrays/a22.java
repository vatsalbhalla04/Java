// Digit Freq:
public class a22 {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 2, 5, 6, 1, 8, 9, 3}; 
        int[] freq = new int[num.length]; // correct.
        for (int i : num) {
            if (i >= 0 && i <= 9) {
                freq[i]++;
            }
        }
        System.out.println("Digit Frequencies:");
        for (int i = 0; i <= 9; i++) {
            if (freq[i] > 0) {
                System.out.println("Digit " + i + ": " + freq[i]);
            }
        }

    }
}
