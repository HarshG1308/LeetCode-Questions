class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        StringBuilder ans = new StringBuilder();
        int sum = 0;
        for(int i = shifts.length-1; i >= 0; i--){
            sum = (sum + shifts[i]) % 26;
            char ch = (char)('a' + (s.charAt(i) - 'a' + sum) % 26);
            ans.insert(0, ch);
        }
        return ans.toString();
    }
}