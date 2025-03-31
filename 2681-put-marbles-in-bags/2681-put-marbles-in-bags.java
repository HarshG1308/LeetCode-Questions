class Solution {
    public long putMarbles(int[] weights, int k) {
        int n = weights.length;
        int[] ps = new int[n-1];
        for(int i = 0; i < n-1; i++) ps[i] = weights[i] + weights[i+1];
        long min = 0, max = 0;
        Arrays.sort(ps);
        for(int i = 0; i < k-1; i++){
            min += ps[i];
            max += ps[n-2-i];
        }
        return max-min;
    }
}