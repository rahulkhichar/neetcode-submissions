class Solution {
    public int subarraySum(int[] nums, int k) {

        int n = nums.length;
        if(n == 0 ) return 0;
        int []prefixSum = new int[n];
        int lastSum = 0;

        Map<Integer,Integer>hashMap = new HashMap<>();
        hashMap.put(0,1);
        int count = 0;

        for(int index = 0 ; index < n; index++) {

           prefixSum[index] = lastSum + nums[index];
           if(hashMap.containsKey(prefixSum[index] - k)) {
            count += hashMap.get(prefixSum[index] - k);
           }
           hashMap.put(prefixSum[index],hashMap.getOrDefault(prefixSum[index],0)+1);
           lastSum =  prefixSum[index];


        }


        return count;
    }
}