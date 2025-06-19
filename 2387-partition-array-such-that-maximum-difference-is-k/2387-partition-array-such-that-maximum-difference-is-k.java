class Solution {
    public int partitionArray(int[] nums, int k) {
        Arrays.sort(nums);
        int cnt = 0;
        int i = nums.length-1, j = nums.length-1;
        while(i>=0 && j >=0){
            if(nums[i] - nums[j] > k){
                cnt++;
                i = j;
            }
            j--;
        }
        return cnt+1;
    }
}