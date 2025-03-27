class Solution {
    public int countGoodTriplets(int[] nums, int a, int b, int c) {
        int ans = 0, n = nums.length;
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                for(int k = j + 1; k < n; k++){
                    if(Math.abs(nums[i] - nums[j]) <= a && Math.abs(nums[j] - nums[k]) <= b && Math.abs(nums[i] - nums[k]) <= c) ans++;
                }
            }
        }
        return ans;
    }
}