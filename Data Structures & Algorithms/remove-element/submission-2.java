class Solution {
    public int removeElement(int[] nums, int val) {
        int n = nums.length;
       
       int startIndex = 0;
       int endIndex = n-1;
       int count = 0;

       while(startIndex < endIndex  ) {
         while( startIndex < n && nums[startIndex] != val  ) startIndex++;
         while( endIndex >= 0 && nums[endIndex] == val) endIndex--;

         if(startIndex < endIndex) {
            count++;
            int temp = nums[startIndex];
            nums[startIndex] = nums[endIndex];
            nums[endIndex] = temp;
         }

       }

       return startIndex;
        
    }
}