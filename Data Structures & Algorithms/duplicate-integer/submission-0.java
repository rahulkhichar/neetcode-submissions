class Solution {
    public boolean hasDuplicate(int[] nums) {

        Map<Integer,Boolean>mp = new HashMap<>();

        for(int number : nums) {
            if(mp.containsKey(number)) return true;
            mp.put(number,true);
        }

        return false;
        
    }
}