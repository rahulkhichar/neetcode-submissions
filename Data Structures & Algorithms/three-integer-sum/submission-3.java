class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;


        List<List<Integer>>ans = new ArrayList<>();
    //    0 0 0 0
        for(int midIndex = 1 ; midIndex < n-1 ; midIndex++ ) {

            int left = 0;
            int right = n - 1;
            while(left < midIndex && right > midIndex) {
                int sum = nums[left]+nums[right]+nums[midIndex];
                if(sum == 0) {
                    List<Integer>tempList = new ArrayList<>();
                    tempList.add(nums[left]);
                    tempList.add(nums[midIndex]);
                    tempList.add(nums[right]);
                    ans.add(tempList);
                    left++;
                    right--;

                } else if(sum < 0) {
                    left++;
                } else {
                    right--;
                }
 
            }

        }

        Set<List<Integer>> set = new LinkedHashSet<>(ans);
        return new ArrayList<>(set);
        
    }
}