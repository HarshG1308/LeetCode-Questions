class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) return new ArrayList<>();
        
        HashMap<String, List<String>> map = new HashMap<>();
        
        for (String s : strs) {
            char[] arr = s.toCharArray();
            Arrays.sort(arr);  // Sort karke key banayi
            String key = new String(arr);
            
            // Agar key nahi hai to new list banao
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            
            map.get(key).add(s);  // add to the list of anagrams
        }
        
        return new ArrayList<>(map.values());  // all grouped anagrams
    }
}
