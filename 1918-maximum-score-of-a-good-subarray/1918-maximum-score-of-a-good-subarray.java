class Solution {
    public int maximumScore(int[] nums, int k) {
        int l = k, r = k;
        int min = nums[k], ass = nums[k];

        while(l > 0 || r < nums.length-1)
        {
            int left = Integer.MIN_VALUE, right = Integer.MIN_VALUE;

            if(l > 0) left = nums[l-1];

            if(r < nums.length-1) right = nums[r+1];

            if(left > right){
                l--;
                min = Math.min(min, left);
            }
            else{
                r++;
                min = Math.min(min, right);
            }
            ass = Math.max(ass, (r-l+1) * min);
        }
        return ass;
    }
}