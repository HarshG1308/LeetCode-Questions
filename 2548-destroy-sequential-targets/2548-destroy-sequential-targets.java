class Solution {
    public int destroyTargets(int[] nums, int s) {
        Map<Integer, Integer> freq = new HashMap<>();
        for(int i : nums) freq.put(i % s, freq.getOrDefault(i%s, 0) + 1);   
        int mc = 0, ans = Integer.MAX_VALUE;
        for(int i : nums){
            int rem = i % s;
            if(freq.get(rem) > mc || (freq.get(rem) == mc && i < ans)){
                ans = i;
                mc = freq.get(rem);
            }
        }
        return ans;
    }
}