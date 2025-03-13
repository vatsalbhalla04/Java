//Print the Maximum from an array : 
public class a7 {
    public static void main(String[] args) {
        int arr[] = {25, 11, 7, 75, 56}; 
        int max = 0;
        int pos = 0; 
        for(int i = 0 ; i<arr.length ; i++){
            if(arr[i] > max) {
                max = arr[i]; 
                pos = i ; 
            }
        } 
        System.out.println("Maximum Value: " + max);
        System.out.println("Position: " + pos);
    }
}
