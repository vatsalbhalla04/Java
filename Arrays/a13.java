// Print the -ve values of an array into postive 
public class a13{
    public static void main(String[] args) {
        int var = 0 ; 
        int positive; 
        int arr[] = {23,45,-778,67,89,90};

        // Using Enchanced for loop : 
        // for(int i : arr){
        //     if(i < var){
        //         positive = -(i) ; 
        //         System.out.println(positive);
        //     }
        // }
        
        for(int i = 0 ; i<arr.length ; i++){
            if(arr[i] < var){
                positive = -arr[i];
                System.out.println(positive);
            }
        }
    }
}