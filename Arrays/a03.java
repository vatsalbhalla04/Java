// min and max from an array 
public class a3{
    public static void main(String[] args) {
        int arr[] = {10,20,40,-9,-900};
        int min = arr[0];
        int max = arr[0];
        for(int i = 0 ; i<arr.length; i++){
            if(arr[i] > 0 ){
                max = arr[i];
            }
            else min = arr[i];
        }
        System.out.println("The maximum number is : "+max);
        System.out.println("The minmum number is : " + min);
    }
}