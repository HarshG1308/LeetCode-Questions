class Solution {
    public int trap(int[] h){
        int n = h.length;
        int[] lmax = new int[n];
        int[] rmax = new int[n];
        lmax[0] = h[0]; rmax[n-1] = h[n-1];
        int ans = 0;
        for(int i = 1; i < n; i++){
            lmax[i] = Math.max(lmax[i-1], h[i]);
        }
        for(int i = n-2; i >= 0; i--){
            rmax[i] = Math.max(rmax[i+1], h[i]);
            ans += Math.min(lmax[i],rmax[i]) - h[i];
        }
        return ans;
    }
}