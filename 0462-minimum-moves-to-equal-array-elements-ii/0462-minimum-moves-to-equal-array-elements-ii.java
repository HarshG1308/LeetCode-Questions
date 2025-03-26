class Solution {
    public int minMoves2(int[] nums) {
        int steps = 0, n = nums.length; Arrays.sort(nums);
        for(int i : nums) steps += Math.abs(nums[n/2] - i);
        return steps;
    }
}