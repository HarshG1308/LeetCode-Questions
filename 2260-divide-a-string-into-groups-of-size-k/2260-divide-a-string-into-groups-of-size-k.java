class Solution {
    public String[] divideString(String s, int k, char fill) {
        int n = s.length();
        int g = (n + k - 1) / k; 
        String[] ans = new String[g];
        int in = 0; 
        for (int i = 0; i < g; i++) {
            StringBuilder temp = new StringBuilder();
            for (int j = 0; j < k; j++) {
                if (in < n) {
                    temp.append(s.charAt(in));
                    in++;
                } else {
                    temp.append(fill);
                }
            }
            ans[i] = temp.toString();
        }
        
        return ans;
    }
}
