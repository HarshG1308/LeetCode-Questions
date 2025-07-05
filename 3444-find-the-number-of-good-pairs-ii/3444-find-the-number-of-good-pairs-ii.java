class Solution {
    public long numberOfPairs(int[] nums1, int[] nums2, int k) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int num : nums2) {
            freq.put(num * k, freq.getOrDefault(num * k, 0) + 1);
        }

        long ans = 0;
        for (int num : nums1) {
            for (int d = 1; d * d <= num; d++) {
                if (num % d == 0) {
                    if (freq.containsKey(d)) ans += freq.get(d);
                    int other = num / d;
                    if (other != d && freq.containsKey(other)) ans += freq.get(other);
                }
            }
        }
        return ans;
    }
}
