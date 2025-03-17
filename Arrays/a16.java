// Transpose the matrix in reverse form 
public class a16 {
    public static void main(String[] args) {
        int a[][] = { { 1, 2, 3 },
                      { 4, 5, 6 },
                      { 7, 8, 9 } };

        for(int i = 0 ; i<a.length ; i++){
            // for(int j = 0 ; j<a.length ; j++){
            for (int[] a1 : a) {
                System.out.print(a1[i] + " ");
            }
            System.out.println();
        }
    }
}
