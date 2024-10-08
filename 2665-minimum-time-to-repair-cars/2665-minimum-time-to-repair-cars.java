class Solution {
    public long repairCars(int[] r, int cars) {
        long l = 0; long h = 0;
        for(int i : r) h = Math.max(i,h);
        h = (long)(h * cars * cars);
        while(l <= h){
            long m = l + (h-l)/2;
            if(possi(r, m, cars)) h = m - 1;
            else l = m + 1;
        }
        return l;
    }
    boolean possi(int [] r, long m, int c){
        int p = 0;
        for(int i : r){
            p += Math.sqrt(m/i);
        }
        return p >= c;
    }
}