class Solution {
    public int countCompleteSubarrays(int[] nums) {
        int n = nums.length, count = 0;
        Set<Integer> totalSet = new HashSet<>();
        for (int num : nums) totalSet.add(num);
        int totalUnique = totalSet.size();
        for (int start = 0; start < n; start++) {
            Set<Integer> windowSet = new HashSet<>();
            for (int end = start; end < n; end++) {
                windowSet.add(nums[end]);
                if (windowSet.size() == totalUnique) {
                    count++;
                }
            }
        }
        return count;
    }
}
