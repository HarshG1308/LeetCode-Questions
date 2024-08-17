class Solution {
    public String removeDuplicates(String s) {
        StringBuilder ans = new StringBuilder();
        for(char i : s.toCharArray()){
            if(ans.length() == 0 || ans.charAt(ans.length() - 1) != i) {
                ans.append(i);
            } else {
                ans.deleteCharAt(ans.length() - 1);
            }
        }
        return ans.toString();
    }
}