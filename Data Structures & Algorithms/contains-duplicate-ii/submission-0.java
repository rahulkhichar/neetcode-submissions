class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer,Integer>mp = new HashMap<>();
        int n = nums.length;

        for(int index = 0 ; index < n ;index++) {
            int num = nums[index];
            if(mp.containsKey(num)) {
                if(index - mp.get(num) <= k) return true;
            }
            mp.put(num,index);
        }
        return false;
        
    }
}