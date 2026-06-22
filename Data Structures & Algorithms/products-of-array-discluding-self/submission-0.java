class Solution {
    public int[] productExceptSelf(int[] nums) {
      
      int left = 1;
      int right = 1;
      int n = nums.length;
      int []leftArray = new int[n+1];
      int []rightArray = new int[n+1];

      for(int i = 0 ; i < n ;i++) {
        left = left*nums[i];
        right = right*nums[n-i-1];
        leftArray[i] = left;
        rightArray[n-i-1] = right;
      }

      for(int i = 1 ; i < n-1 ;i++) {
        nums[i] = leftArray[i-1]*rightArray[i+1];
      }
      nums[0] = rightArray[1];
      nums[n-1] = leftArray[n-2];

      return nums;
        
    }
}  
