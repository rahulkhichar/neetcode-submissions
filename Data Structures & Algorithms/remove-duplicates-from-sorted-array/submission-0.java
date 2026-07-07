class Solution {
    public int removeDuplicates(int[] nums) {
        int length = nums.length;
        if(length <= 1) return length;
        int firstIndex = 0;
        int secondIndex = 1;

        while( secondIndex < length   ) {

            while( secondIndex < length &&  nums[firstIndex] == nums[secondIndex]) {
                secondIndex++;
            }

            if(secondIndex < length) {
                nums[firstIndex + 1] = nums[secondIndex];
                firstIndex++;
                secondIndex++;
            }

        }

        return firstIndex+1;
        
    }
}