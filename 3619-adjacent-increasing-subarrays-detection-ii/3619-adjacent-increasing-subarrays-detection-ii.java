class Solution {
    public int maxIncreasingSubarrays(List<Integer> nums) {
        int prev = 0;
        int curr = 1;
        int k = 1;
        int n = nums.size();
        for (int i = 1; i < n; i++) {
            if (nums.get(i) > nums.get(i - 1)) {
                curr++;
                k = Math.max(k, curr / 2);
            } else {
                int temp = Math.min(prev, curr);
                k = Math.max(k, temp);
                prev = curr;
                curr = 1;
            }
        }
        k = Math.max(k, Math.min(prev, curr));
        return n == 0 ? 0 : k;
    }
}