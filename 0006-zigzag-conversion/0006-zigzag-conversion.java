class Solution {
    public String convert(String s, int numRows) {
        String sb[] = new String[numRows];
        boolean b = true;
        if (numRows == 1) {
            return s;
        }
        for (int i = 0; i < numRows; i++) {
            sb[i] = "";
        }
        for (int i = 0, j = 0; i < s.length();) {
            sb[j] += (s.charAt(i++));
            if (j == numRows - 1) {
                b = false;
            }
            if (j == 0) {
                b = true;
            }
            if (b) {
                j++;
            } else {
                j--;
            }
        }
        String res = "";
        for (String o : sb) {
            res+=o;
        }
        return res;
    }
}