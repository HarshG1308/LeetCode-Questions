class Solution {
    public int countCompleteDayPairs(int[] hours) {
        int ans = 0;
        int[] freq = new int[24];
        for(int i : hours){
            int rem = i%24;
            int comp = (24 - rem) % 24;
            ans += freq[comp];
            freq[rem]++;
        }
        return ans;
    }
}