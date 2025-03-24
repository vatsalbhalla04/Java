//Adding one to number represented as array of digits
public class a29{
    public static void main(String[] args) {
        int a[] = {9,9,9};
        int temp = 0 ; 
        int num = 0 ; 
        for(int i = 0 ; i<a.length ; i++){
                num=a[i];
                temp = temp * 10 + num;
        }
        System.out.println(temp+1);
    }
}