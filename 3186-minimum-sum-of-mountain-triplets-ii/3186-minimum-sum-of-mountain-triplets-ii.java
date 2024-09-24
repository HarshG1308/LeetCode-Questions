class Solution {
    public int minimumSum(int[] nums) {
        int n = nums.length;
        int[] lmin = new int[n];
        int[] rmin = new int[n];
        int min = nums[0];
        for(int i = 0; i < n; i++){
            lmin[i] = min;
            min = Math.min(nums[i],min);
        }
        min =nums[n-1];
        for(int i = n-1; i >=0; i--){
            rmin[i] = min;
            min = Math.min(nums[i], min);
        }
        int ans = -1;
        for(int i = 0; i <n; i++){
            if((nums[i] > lmin[i]) && (nums[i] > rmin[i])){
                if(ans == -1){
                    ans = nums[i] + lmin[i] + rmin[i];
                } else { 
                    ans = Math.min(ans, nums[i] + lmin[i] + rmin[i]);
                }
            }
        }
        return ans;
    }
}