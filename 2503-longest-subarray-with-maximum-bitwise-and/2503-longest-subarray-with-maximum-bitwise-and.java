class Solution {

    public int longestSubarray(int[] nums) {
        int m = 0, ans = 0, cs = 0;
        for (int num : nums) {
            if (m < num) {
                m = num;
                ans = cs = 0;
            }
            if (m == num) {
                cs++;
            } else {
                cs = 0;
            }
            ans = Math.max(ans, cs);
        }
        return ans;
    }
}