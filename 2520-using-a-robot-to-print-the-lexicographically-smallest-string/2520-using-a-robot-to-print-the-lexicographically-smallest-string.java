class Solution {
    public String robotWithString(String s) {
        int n = s.length();
        int[] min = new int[n];
        min[n - 1] = s.charAt(n - 1);
        for (int i = n - 2; i >= 0; i--) min[i] = Math.min(min[i + 1], s.charAt(i));
        StringBuilder t = new StringBuilder(), res = new StringBuilder();
        int i = 0;
        while (i < n || t.length() > 0) {
            while (i < n && (t.length() == 0 || t.charAt(t.length() - 1) > min[i])) t.append(s.charAt(i++));
            res.append(t.charAt(t.length() - 1));
            t.deleteCharAt(t.length() - 1);
        }
        return res.toString();
    }
}