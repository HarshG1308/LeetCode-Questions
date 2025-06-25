class Solution {
    public long kthSmallestProduct(int[] nums1, int[] nums2, long k) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        long left = -10000000000L, right = 10000000000L;
        while (left < right) {
            long mid = left + (right - left) / 2;
            if (countPairs(nums1, nums2, mid) < k) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return left;
    }

    private long countPairs(int[] nums1, int[] nums2, long x) {
        long count = 0;
        for (int a : nums1) {
            if (a > 0) {
                int l = 0, r = nums2.length - 1;
                while (l <= r) {
                    int m = (l + r) / 2;
                    if ((long)a * nums2[m] <= x) {
                        l = m + 1;
                    } else {
                        r = m - 1;
                    }
                }
                count += l;
            } else if (a < 0) {
                int l = 0, r = nums2.length - 1;
                while (l <= r) {
                    int m = (l + r) / 2;
                    if ((long)a * nums2[m] <= x) {
                        r = m - 1;
                    } else {
                        l = m + 1;
                    }
                }
                count += nums2.length - l;
            } else if (a == 0 && x >= 0) {
                count += nums2.length;
            }
        }
        return count;
    }
}
