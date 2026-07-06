class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;

        Set<Integer>hashSet = new HashSet<>();

        for(int  index = 0 ; index <  nums.length; index++) {
            hashSet.add(nums[index]);
        }
        int ans = 1;
        for(int index = 0 ;index < nums.length; index++) {

            if(!hashSet.contains(nums[index]+1)) {
                int count = 0;
                int element = nums[index];
                while(hashSet.contains(element)) {
                    count++;
                    element--;
                }
                ans = Math.max(ans,count);
            }
        }

        return ans;
        
    }
}
