class Solution {
    public int search(int[] nums, int target) {
        int lastIndex = nums.length - 1;
        int startIndex = 0;

        while(startIndex <= lastIndex) {
            int midIndex = (lastIndex - startIndex)/2 + startIndex;
            if(nums[midIndex] == target ) return midIndex;
            if(nums[midIndex] > target) {
                lastIndex = midIndex-1;
            } else {
                startIndex = midIndex+1;
            }
        }

        return -1;
        
    }
}
