// Print the Max Trio and there product 
public class a24 {
    public static void main(String[] args) {
        int[] num = {10, 3, 5, 6, 20};

        // Initialize with minimum possible values
        int max = 0;
        int max_2 = 0;
        int max_3 = 0;

        for (int i = 0; i < num.length; i++) {
            if (num[i] > max) {
                max_3 = max_2;  
                max_2 = max; 
                max = num[i];
            } 
            else if (num[i] > max_2 && num[i] != max) {
                max_3 = max_2;  
                max_2 = num[i]; 
            } 
            else if (num[i] > max_3 && num[i] != max_2 && num[i] != max) {
                max_3 = num[i]; 
            }
        }
        System.out.println("Largest: " + max);
        System.out.println("Second Largest: " + max_2);
        System.out.println("Third Largest: " + max_3);
        System.out.println(max*max_2*max_3);
    }
}
