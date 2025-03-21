// Move all zeros of an array at the end.
public class a26{
    public static void main(String[] args) {
        int a[] = {10,20,0,30,0,40,34};
        int temp[] = new int[a.length];
        int index = 0 ; 

        for(int i = 0 ; i<a.length ;i++){
            if(a[i]>0) temp[index++] = a[i];
        }
        for(int i = 0 ; i<a.length ;i++){
            a[i] = temp[i];
            System.out.print(a[i]+" ");
        }
    }
}