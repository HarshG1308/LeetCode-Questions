class Solution {
    public int findShortestSubArray(int[] nums) {
        int ans = Integer.MAX_VALUE;
        Map<Integer, Integer> count = new HashMap<>();
        Map<Integer, Integer> left = new HashMap<>();
        Map<Integer, Integer> right = new HashMap<>();
        for(int i : nums){
            count.put(i, count.getOrDefault(i, 0)+1);
        }
        for(int i = 0; i < nums.length; i++){
            if(!left.containsKey(nums[i])){
                left.put(nums[i],i);
            }
            right.put(nums[i],i);
        }
        int degree = Integer.MIN_VALUE;
        for(int i : count.keySet()){
            degree = Math.max(degree, count.get(i));
        }
        for (Integer key : count.keySet()) {
            if (count.get(key) == degree) {
                int arraySize = right.get(key) - left.get(key) + 1;
                ans = Math.min(ans, arraySize);
            }
        }
        return ans; 
    }
}