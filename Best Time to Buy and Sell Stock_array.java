public class Solution {
    public int maxProfit(int[] prices) {
       int profit = 0;
       int cur = 0;
       for(int i = 0; i < prices.length - 1; i++){
           int diff = prices[i+1] - prices[i];
           cur = Math.max(diff, cur + diff);
           profit = Math.max(cur, profit);
       }
       return profit;
    }
}
