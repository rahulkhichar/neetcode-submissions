class Solution {
    public int firstMissingPositive(int[] nums) {
         int length = nums.length;
        boolean []hash = new boolean[length +1];

        for(int index = 0 ; index < nums.length ;index++){

            if(nums[index]> 0 &&  nums[index] <= length) {
                hash[nums[index]] = true;
            }

        }
        for(int index = 1; index <= length ;index++) {
            if(!hash[index]) return index;

        }

        return length+1;
    }
}