class Solution {
    public int maxProfit(int[] prices) {
        
        int minPriceofBuying=prices[0];
        int profit=0;
        for(int i=1;i<prices.length;i++){
     int  cost = prices[i]-minPriceofBuying;
     profit=Math.max(profit,cost);
minPriceofBuying =Math.min(minPriceofBuying,prices[i]);

      
        }

return profit;
    }
}