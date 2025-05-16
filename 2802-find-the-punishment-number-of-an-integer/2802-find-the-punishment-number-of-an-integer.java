class Solution {
    public int punishmentNumber(int n) {
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            int sq = i * i;
            if (isValid(Integer.toString(sq), 0, i, 0)) {
                ans += sq;
            }
        }
        return ans;
    }

    private boolean isValid(String s, int idx, int tgt, int sum) {
        if (idx == s.length()) return sum == tgt;
        for (int i = idx + 1; i <= s.length(); i++) {
            int num = Integer.parseInt(s.substring(idx, i));
            if (isValid(s, i, tgt, sum + num)) return true;
        }
        return false;
    }
}
