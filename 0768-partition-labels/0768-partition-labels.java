class Solution {
    public List<Integer> partitionLabels(String s) {
        int n = s.length();
        List<Integer> ans = new ArrayList<>();
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++) map.put(s.charAt(i), i);
        int mi = 0, li = 0;
        for(int i = 0; i < n; i++){
            mi = Math.max(mi, map.get(s.charAt(i)));
            if(mi == i){
                ans.add(mi - li + 1);
                li = i + 1;
            }
        }
        return ans;
    }
}