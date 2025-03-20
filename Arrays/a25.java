// Product of max and min values in an array : 
class max {
    int maxProduct(int[] arr) {
        int n = arr.length;
        if (n < 3) return -1; // Not enough elements for a valid product

        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE, max3 = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
        
        for (int num : arr) {
            // Update max values
            if (num > max1) {
                max3 = max2;
                max2 = max1;
                max1 = num;
            } else if (num > max2) {
                max3 = max2;
                max2 = num;
            } else if (num > max3) {
                max3 = num;
            }

            // Update min values
            if (num < min1) {
                min2 = min1;
                min1 = num;
            } else if (num < min2) {
                min2 = num;
            }
        }

        return Math.max(max1 * max2 * max3, min1 * min2 * max1);
    }
}

public class a25 {
    public static void main(String[] args) {
        max sol = new max();
        
        int[] arr1 = {10, 3, 5, 6, 20};
        System.out.println("Max Product: " + sol.maxProduct(arr1)); // Output: 1200

        int[] arr2 = {10, -10, 5, -6, 20};
        System.out.println("Max Product: " + sol.maxProduct(arr2)); // Output: 1200

        int[] arr3 = {170, -935, 699};
        System.out.println("Max Product: " + sol.maxProduct(arr3)); // Output: -111106050
    }
}
