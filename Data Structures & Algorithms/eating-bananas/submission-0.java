class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        int minBan = 1;
        int maxBan = 1;
        for(int number : piles) maxBan = Math.max(maxBan , number);
        int ans = 0;

        while(minBan <= maxBan) {
            int mid = (maxBan - minBan ) /2 +minBan;

            int totalTime = 0;

            for(int number : piles) totalTime += (mid+number-1)/mid;

            if(totalTime <= h) {
                ans = mid;
                maxBan = mid - 1;
                
            } else {
               minBan = mid+1;
            }

        }

        return ans;
        
    }
}
