class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        boolean []vis = new boolean[n];
        
        for(int index = 0 ; index < n;index++ ) {
             
            if(!vis[index]) {
            vis[index] = true;
            int nextIndex = index;
            int value = nums[index];
            while((nextIndex+k)%n != index ) {
                 nextIndex = (nextIndex+k)%n;
                int temp = nums[nextIndex];
                nums[nextIndex] = value;
                value = temp;
                vis[nextIndex] = true;
            }
            nums[index] = value;
            }


        }
        
    }
}