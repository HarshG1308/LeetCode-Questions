class Solution {
    public long maximumTripletValue(int[] nums) {
        long ans = 0;
        int n = nums.length;
        int[] lmax = new int[n];
        int[] rmax = new int[n];
        int max = nums[0];
        for(int i = 1; i < n; i++)
        {
            lmax[i] = max;
            max = Math.max(max,nums[i]);
        }
        max = nums[n-1];
        for(int i = n-2; i >=0; i--)
        {
            rmax[i] = max;
            max = Math.max(max,nums[i]);
        }
        for(int i =1; i <n-1; i++){
            long temp = (long)(lmax[i]-nums[i]) * rmax[i];
            ans = Math.max(ans, temp);
        }
        return ans;
    }
}