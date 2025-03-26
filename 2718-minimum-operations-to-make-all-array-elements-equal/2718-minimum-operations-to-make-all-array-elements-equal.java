class Solution {
    public List<Long> minOperations(int[] nums, int[] queries) {
        List<Long> ans = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);

        long[] ps = new long[n];  
        ps[0] = nums[0];
        for (int i = 1; i < n; i++) {
            ps[i] = ps[i - 1] + nums[i];
        }

        for (int q : queries) {
            int mid = Arrays.binarySearch(nums, q);
            if (mid < 0) mid = -mid - 1;  

            long leftSum = (mid > 0) ? ps[mid - 1] : 0;  
            long rightSum = ps[n - 1] - leftSum;  

            long leftOps = (long) mid * q - leftSum;
            long rightOps = rightSum - (long) (n - mid) * q;

            ans.add(leftOps + rightOps);
        }
        return ans;
    }
}