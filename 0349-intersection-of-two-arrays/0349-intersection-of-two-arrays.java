import java.util.*;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> s = new HashSet<>();
        Set<Integer> s1 = new HashSet<>();
        for (int i : nums1) s.add(i);
        for (int i : nums2) s1.add(i);
        s.retainAll(s1);
        int[] ans = new int[s.size()];
        int i = 0;
        for (int num : s) ans[i++] = num;
        return ans;
    }
}
