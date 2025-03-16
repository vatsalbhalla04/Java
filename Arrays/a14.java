// Shift the values of an array into another array :
public class a14 {
    @SuppressWarnings("ManualArrayToCollectionCopy")
    public static void main(String[] args) {
        int []a = {1,2,3,4,5,6};
        int []b = new int[a.length];
        for(int i = 0 ; i<a.length ; i++){
            b[i] = a[i]; 
        }
        System.out.print("Array B : ");
        for(int i = 0 ; i<b.length;i++){
            System.out.print(b[i] + " ");
        }
    }
}
