class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        int ans = 0, n = time.length;
        int[] map = new int[60];
        for(int i = 0; i < n; i++){
            int rem = time[i] % 60;
            ans += map[(60 - rem)%60];
            map[rem]++;
        }
        return ans;
    }
}