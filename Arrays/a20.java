// print and store the factorial number of current values of an array into another
public class a20 {
    public static void main(String[] args) {

        int []a = {1,2,3,4,5,6};
        int factors [] = new int[a.length];

        for(int i = 0 ; i<a.length ; i++){
            int fact = 1 ; 
            int num = a[i];

            for(int j = 1 ; j<=num ; j++){
                fact = fact * j;
            }
            factors[i] = fact ; 
        }
        System.out.print("Factorials are : ");
        for(int i = 0 ; i<factors.length;i++){
            System.out.print(factors[i] + " ");
        }
    }
}
