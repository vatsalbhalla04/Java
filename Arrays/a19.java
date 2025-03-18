// find the Largest number from the array
public class a19 {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 44, 55};
        int max = 0 ; 
        int max_2 = 0 ; 
        for(int i = 0 ; i<num.length;i++){
            if(num[i] > max) max = num[i];
        }
        // to find the second max : 
        for(int i = 0 ; i<num.length;i++){
            if(num[i] != max && num[i] > max_2){
                max_2 = num[i];
            }
        }
        System.out.println("Maximum: " + max);
        System.out.println("Second Maximum: " + max_2);    
    }
}
