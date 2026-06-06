class Solution {
    public boolean hasDuplicate(int[] nums) {

        Set<Integer>mp = new HashSet<>();

        for(int number : nums) {
            if(mp.contains(number)) return true;
            mp.add(number);
        }

        return false;
        
    }
}