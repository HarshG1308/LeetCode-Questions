class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k<=1) return 0;
        int prod=1, ass = 0, i = 0;
        for(int j=0;j<nums.length;j++){
           prod*=nums[j];
           while(prod >= k && i < nums.length){
            prod/=nums[i];
            i++;
           }
           int n = j-i+1;
           ass+=n;
        }
        return ass;
    }
}