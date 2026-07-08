class Solution {

    public  void revers(int []nums,int startIndex, int endIndex) {

        while(startIndex<endIndex) {
            int temp = nums[startIndex];
            nums[startIndex] = nums[endIndex];
            nums[endIndex] = temp;
            startIndex++;
            endIndex--;

        }
    }
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = (n+k)%n;
        revers(nums,0,n-1);
        revers(nums,0,k-1);
         revers(nums,k,n-1);


   
    }
}