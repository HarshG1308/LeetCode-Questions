class Solution {
    public String triangleType(int[] nums) {
        Arrays.sort(nums);
        Set<Integer> s = new HashSet<>();
        for (int i : nums) s.add(i);
        int n = s.size();
        if (nums[0] + nums[1] <= nums[2]) return "none";
        if (n == 1) return "equilateral";
        if (n == 2) return "isosceles";
        return "scalene";
    }
}