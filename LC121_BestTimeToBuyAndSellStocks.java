
// max(prices[j] - prices[i]), where j > i
class Solution {
    public int maxProfit(int[] prices) {
        // return maxProfitBrutforce(prices);
        return maxProfitOptimal(prices);
    }
    
    public static final int maxProfitOptimal(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        
        for (int i = 0; i < prices.length; i++) {
            int currentPrice = prices[i];
            minPrice = currentPrice < minPrice ? currentPrice : minPrice;
            
            int currentProfit = currentPrice - minPrice;
            maxProfit = maxProfit < currentProfit ? currentProfit : maxProfit;
        } 
        
        return maxProfit;
    }
    
    public static final int maxProfitBrutforce(int[] prices) {
        int maxProfit = 0;
        
        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                int tempProfit = prices[j] - prices[i];
                maxProfit = tempProfit > maxProfit ? tempProfit : maxProfit;
            }
        }
        
        return maxProfit;
    }
}
