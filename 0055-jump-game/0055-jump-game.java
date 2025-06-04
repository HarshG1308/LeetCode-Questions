class Solution {
    public boolean canJump(int[] nums) {
        // return solve(nums, 0, nums.length-1);
        int reachable = 0;
        for(int i = 0; i < nums.length; i++){
            if(i > reachable) return false;
            reachable = Math.max(reachable, i + nums[i]);
        }
        return true;
    }
    // boolean solve(int[] nums, int s, int e){
    //     if(s >= e) return true;
    //     int max = nums[s];
    //     for(int i = 1; i <= max; i++){
    //         if(solve(nums, s + i, e)) return true;
    //     }
    //     return false;
    // }
}