class Solution {

    public  String  getTheFrequencyString(String str) {
        int []freq = new int[27];
        for(char ch : str.toCharArray()) {
            freq[ch - 'a']++;
        }
        StringBuilder str1 = new StringBuilder();
      for(int i = 0 ; i < 27; i++) {
        if(freq[i] > 0) {
            str1.append((char)(i+'a'));
            str1.append(freq[i]);
        }
      }
      return str1.toString();
    }
    public List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>>ans  = new ArrayList<>();
        Map<String,List<String>>mp = new HashMap<>();
        for(String str : strs) {
            String getKey = getTheFrequencyString(str);
            if(mp.containsKey(getKey)) {
                mp.get(getKey).add(str);
            }  else {
                List<String>newList = new ArrayList<>();
                newList.add(str);
                mp.put(getKey,newList);
            }
            
        }

        for(Map.Entry<String,List<String>>entry: mp.entrySet()){
            ans.add(entry.getValue());
        }

    //    System.out.println(getTheFrequencyString(strs[0]));


        return ans;
        
    }
}
