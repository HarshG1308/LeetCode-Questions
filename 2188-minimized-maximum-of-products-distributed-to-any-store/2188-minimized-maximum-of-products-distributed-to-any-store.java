class Solution {
    public int minimizedMaximum(int n, int[] arr) {
        int sum = 0, l = 0, h = Integer.MIN_VALUE;
        for(int i : arr) {sum += i; h = Math.max(i,h);}
        while(l <= h){
            int mid = l + (h-l)/2;
            if(can(arr, mid, n)) h = mid-1;
            else l = mid + 1;
        }
        return l;
    }
    boolean can(int[] arr, int mid, int n){
        int p = 0;
        for(int i : arr){
            p += Math.ceil((double)i/mid);
        }
        return p <= n;
    }
}