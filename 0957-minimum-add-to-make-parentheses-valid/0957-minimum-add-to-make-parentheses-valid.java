class Solution {
    public int minAddToMakeValid(String s) {
        int o = 0, ch = 0;
        for(char c : s.toCharArray()){
            if(c == '(') o++;
            else{
                if (o > 0) {
                    o--;  
                } else {
                    ch++;
                }
            }
        }
        return o+ch;
    }
}