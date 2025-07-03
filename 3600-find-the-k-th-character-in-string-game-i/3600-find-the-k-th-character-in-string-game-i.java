class Solution {
    public char kthCharacter(int k) {
        String s = "a";
        while(k > s.length()){
            StringBuilder temp = new StringBuilder();
            for(char c : s.toCharArray()){
                temp.append((char)(c+1));
            }
            s = s + temp.toString();
        }
        return s.charAt(k-1);
    }
}