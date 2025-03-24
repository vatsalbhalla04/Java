// Stock Buy and Sell: 
public class a30 {
    public static void main(String[] args) {
        int prices[] = {10, 1, 3, 6, 9, 2};
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0 ; 

        for (int price : prices) {
            minPrice = Math.min(minPrice, price);
            maxProfit = Math.max(maxProfit, price - minPrice);
        }
        System.out.println("Final Min Price: " + minPrice);
        System.out.println("Max profit is : " + maxProfit);
    }
}
