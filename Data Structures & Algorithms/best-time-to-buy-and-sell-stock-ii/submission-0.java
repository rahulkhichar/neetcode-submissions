class Solution {
    public int maxProfit(int[] prices) {
        int length = prices.length;
        
        int ans = 0;

        for(int index = 1 ;index < length; index++) {
            if(prices[index] >= prices[index-1]) {
                ans += prices[index] - prices[index-1];
            }
        }

        return ans;
    }
}