class Solution {
    public int jump(int[] nums) {
        int re = 0, ans = 0;
        for(int i = 0; i < nums.length; i++){
            int prev = re;
            re = Math.max(re, i + nums[i]);
            if(re != prev) ans++;
        }
        return Math.max(ans-1, 0);
    }
}