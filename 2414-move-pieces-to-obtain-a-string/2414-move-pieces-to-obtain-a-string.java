class Solution {
    public boolean canChange(String start, String target) {
        int left = 0, right = 0;

        for (int i = 0; i < start.length(); i++) {
            if (start.charAt(i) == 'R') {
                right++;
                if (left != 0) return false;
            } else if (start.charAt(i) == 'L') {
                left--;
            }
            if (target.charAt(i) == 'R') {
                right--;
            } else if (target.charAt(i) == 'L') {
                left++;
                if (right != 0)
                    return false;
            }
            if (left < 0 || right < 0)
                return false;
        }
        return left == 0 && right == 0;
    }
}