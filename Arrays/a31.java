// Finding sum of digits of a number until sum becomes single digit         
public class a31 {
    public static void main(String[] args) {
        int n = 1234;

        // This method is not recommeded as we don't know if the number has how many digits.
        // for(int i = 0 ; i<9 ; i++){
        // n1 = n1 + n % 10;
        // n /= 10;
        // }
        // for(int i = 0 ; i<2 ; i++){
        // sum = sum + n1 % 10 ;
        // n1 = n1/10;
        // }
        // System.out.println(sum);

        // using the while to compare the length of digit :
        while (n > 9) {
            int sum = 0;
            while (n > 0) {
                sum = sum + n % 10;
                n = n / 10;
            }
            n = sum;
        }
        System.out.println(n);
    }
}
