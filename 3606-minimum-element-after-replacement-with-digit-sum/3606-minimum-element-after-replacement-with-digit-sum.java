class Solution {
    public int minElement(int[] nums) {
        int ans = Integer.MAX_VALUE, n = nums.length;
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) arr[i] = sum(nums[i]);
        for(int i : arr) ans = Math.min(ans, i);
        return ans;
    }

    int sum(int num){
        int ans = 0;
        while(num > 0){
            int r = num%10;
            ans += r;
            num /= 10;
        }
        return ans;
    }
}