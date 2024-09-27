class Solution {
    public int minOperations(int[] nums, int x) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum+=nums[i];
            map.put(sum,i);
        }
        map.put(0,-1);
        int t = sum-x;
        if(t<0) return -1;
        sum=0;
        int res = Integer.MIN_VALUE;
        for(int i=0; i < n; i++){
            sum+=nums[i];
            if(map.containsKey(sum-t)) res =Math.max(res, i - map.get(sum-t));
        }
        return res==Integer.MIN_VALUE?-1:n-res;
    } 
}