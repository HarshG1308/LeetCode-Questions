class Solution {
    public int minimumDeletions(String word, int k) {
        int n = word.length();
        Map<Character, Integer> map = new HashMap<>();
        for(char c : word.toCharArray()){
            if(!map.containsKey(c)) map.put(c, 1);
            else map.put(c, map.getOrDefault(c, 0) + 1);
        }
        int ans = Integer.MAX_VALUE;
        for(char c : map.keySet()){
            int del = 0;
            int base = map.get(c);
            for(char ch : map.keySet()){
                int f = map.get(ch);
                if(f < base) del += f;
                if(f > base + k) del += f - base - k;
            }
            ans = Math.min(ans, del);
        }
        return ans;
    }
}