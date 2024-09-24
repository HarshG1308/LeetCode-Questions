class Solution {
    public int sumOfBeauties(int[] nums) {
        int n = nums.length;
        int[] lmax = new int[n];
        int[] rmin = new int[n];
        int max = nums[0]; 
        for(int i = 0; i < n; i++)
        {
            lmax[i] = max;
            max = Math.max(max, nums[i]);
        }
        int min = nums[n-1];
        for(int i = n-1; i >= 0; i--)
        {
            rmin[i] = min;
            min = Math.min(min, nums[i]);
        }
        int ans = 0;
        for(int i = 1; i < n-1; i++)
        {
            if((lmax[i] < nums[i]) &&(nums[i] < rmin[i])) ans+=2;
            else if((nums[i-1] < nums[i]) && (nums[i] < nums[i+1])) ans+=1;
        }
        return ans;
    }
}