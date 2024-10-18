class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int ans = nums.length+1, l = 0, w = 0;
        for(int i = 0; i < nums.length; i++){
            w += nums[i];
            while(w >= target){
                ans = Math.min(ans, i - l + 1);
                w -= nums[l++];
            }
        }
        return ans == nums.length+1 ? 0 : ans;
    }
}