// Addition in 2D array
public class a18 {
    public static void main(String[] args) {
        int a[][] = { { 1, 2, 3 },
                      { 4, 5, 6 },
                      { 7, 8, 9 }
        };
        int b[][] = { { 10, 11, 12 },
                      { 13, 14, 15 },
                      { 16, 17, 18 }
        };
        int add[][] = new int[a.length][b.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                add[i][j] = a[i][j] + b[i][j];
                System.out.print(add[i][j] + " ");
            }
            System.out.println();
        }
    }
}
