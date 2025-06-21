class Solution {
    public int minimumDeletions(String word, int k) {
        int[] freq = new int[26];
        for(char c : word.toCharArray()) freq[c-'a']++;
        int ans = word.length();
        for(int j = 0; j < 26; j++){
            if(freq[j] == 0) continue;
            int f = freq[j];
            int max = f + k;
            int del = 0;
            for(int i = 0; i < 26; i++){
                if(freq[i] < f) del += freq[i];
                else if(freq[i] > max) del += freq[i]-max;
            }
            ans = Math.min(ans, del);
        }
        return ans;
    }
}