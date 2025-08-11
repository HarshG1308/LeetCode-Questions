class Solution {
    public int jump(int[] nums) {
        int steps = 0, max = 0, lastMax = 0;
        for(int i = 0; i < nums.length-1; i++){
            max = Math.max(max, i + nums[i]);
            if(lastMax == i){
                steps++;
                lastMax = max;
                if(max >= nums.length-1) break;
            }
        }
        return steps;
    }
}