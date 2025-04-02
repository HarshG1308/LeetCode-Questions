class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int[] arr = new int[k];
        int sum = 0;
        arr[0] = 1;
        int ans = 0;
        for (int i : nums) {
            sum += i;
            int rem = sum % k >= 0 ? sum % k : k + (sum % k);
            if (arr[rem] > 0) {
                ans += arr[rem];
            }
            arr[rem]= arr[rem]+1;
        }
        return ans;
    }
}