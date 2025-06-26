public class Solution {
    public int longestSubsequence(String s, int k) {
        int n = s.length();
        int z = 0;
        int o = 0;
        long v = 0;
        long p = 1;
        for (char c : s.toCharArray()) {
            if (c == '0') z++;
        }
        for (int i = n - 1; i >= 0; i--) {
            if (s.charAt(i) == '1') {
                if (v + p > k) continue;
                v += p;
                o++;
            }
            p <<= 1;
            if (p > k) break;
        }
        return z + o;
    }
}