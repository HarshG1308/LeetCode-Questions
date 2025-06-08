class Solution {
    public List<Integer> lexicalOrder(int n) {
        String[] s = new String[n];
        for (int i = 1; i <= n; i++) {
            s[i-1] = Integer.toString(i);
        }
        Arrays.sort(s);  
        List<Integer> ans = new ArrayList<>();
        for (String str : s) {
            ans.add(Integer.parseInt(str));
        }
        return ans;
    }
}
