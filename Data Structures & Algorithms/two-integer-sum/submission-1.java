class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> mp = new HashMap<>();
        int []ans = new int[2];

        for(int index = 0 ; index < nums.length; index++) {

            if(mp.containsKey(target-nums[index])) {

                ans[0] = mp.get(target-nums[index]);
                ans[1] = index;
                return ans;
             }  

            mp.put(nums[index],index);
        }

        // for(int  num : nums) {
        //     if(mp.containsKey(target - num)) return true;
        //     mp.put(num,true);
        // }

        return ans;
        
    }
}
