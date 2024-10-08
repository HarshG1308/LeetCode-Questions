class Solution {
    public int maximumCandies(int[] candies, long k) {
        int l = 1; int h = 0;
        for(int i : candies) h = Math.max(i,h);
        while(l <= h){
            int mid = l + (h-l)/2;
            if(cangive(candies, mid, k)) l = mid + 1;
            else h = mid-1;
        }
        return h;
    }
    boolean cangive(int[] candies, int mid, long k){
        long ki = 0;
        for(int i : candies) {
            ki += i/mid;
        }
        return ki >= k;
    }
}