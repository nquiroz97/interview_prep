package data_structures_and_algos_java.word_problems;
public class BestTimeToBuyStock {

    public static void main(String[] args) {
        int[] array = {7,1,5,3,6,4};
        int maxPrice = maxProfit(array);
        System.out.println(maxPrice);
    }

    public static int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            //sets min
            if (prices[i] < minPrice)
                minPrice = prices[i];
            else if (prices[i] - minPrice > maxProfit)
                maxProfit = prices[i] - minPrice;

            System.out.println("max" + maxProfit);
            System.out.println("min" + minPrice);
        }
        return maxProfit;
        
    }
    
}
