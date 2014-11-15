public class Solution {
    public int maxProfit(int[] prices){
       int profit = 0;
       int cur = 0;
       for(int i = 0; i < prices.length - 1; i++){
           cur = Math.max(0, cur + prices[i+1] - prices[i]);
           profit = Math.max(cur, profit);
       }
       return profit;
    }
}
