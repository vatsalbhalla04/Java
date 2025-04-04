// Java Array Methods : 
import java.util.Arrays;

public class a5 {
    public static void main(String[] args) {
        int []arr = {10,20,30,60,45,1,2};

        //1) Arrays.toString() - Convert Array to String
        System.out.println(Arrays.toString(arr));

        //2) Sorting an array :
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        
        //3) Fill an Array with a Value : 
        Arrays.fill(arr, 7);
        System.out.println(Arrays.toString(arr));

        // 4) Compare Two Arrays: 
        int [] arr2 = {1,23,4,5};
        System.out.println(Arrays.equals(arr, arr2));
    }
}
