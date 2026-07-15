class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum = 0;
        int n = nums.length;
        int lastIndex = 0;
        int ans = 100001;

        for(int index = 0 ; index < n ;index++){
        
            sum += nums[index];

            while(sum >= target) {
                ans = Math.min(ans,index - lastIndex + 1);
                sum -= nums[lastIndex];
                lastIndex++;

            }

        }
        return ans == 100001 ? 0 : ans;
        
    }
}