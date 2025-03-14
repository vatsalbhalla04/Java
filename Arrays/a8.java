// split an array into two arrays each containg even and odd values separately
public class a8 {
    public static void main(String[] args) {
        int arr[] = { 23, 45, 67, 78, 90, 22, 444, 56 };

        int[] arre = new int[arr.length];
        int[] arro = new int[arr.length];

        int evenIndex = 0;
        int oddIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                arre[evenIndex++] = arr[i];
            } else {
                arro[oddIndex++] = arr[i];
            }
            //When you increment the index (evenIndex++ or oddIndex++), it moves the pointer to the next available slot, so the next even/odd number gets placed in the correct position.
        }
        for (int i = 0; i < evenIndex; i++) {
            System.out.println("Even Numbers are :" + arre[i] + " ");
        }
        for (int i = 0; i < oddIndex; i++) {
            System.out.println("Odd numbers are : " + arro[i] + " ");
        }
    }
}
