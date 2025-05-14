class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n = strs.length;
        String r = strs[0];
        for(int i = 0; i < n; i++){
            while(strs[i].indexOf(r) != 0){
                r = r.substring(0, r.length()-1);
            }
            if(r.isEmpty()){
                return "";
            }
        }
        return r;
    }
}