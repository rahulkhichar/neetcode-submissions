class Solution {
    public int maxProfit(int[] prices) {

        int ans=0;
       
        int min=Integer.MAX_VALUE;

        for(int number:prices) {
            min=Math.min(number,min);
            ans=Math.max(ans,number-min);
        }

        return ans;
        
    }
}
