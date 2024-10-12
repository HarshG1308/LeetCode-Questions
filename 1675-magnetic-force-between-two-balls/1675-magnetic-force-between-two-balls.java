class Solution {
    public int maxDistance(int[] arr, int m) {
        Arrays.sort(arr);
        int l = 0, h = arr[arr.length-1] - arr[0];
        while(l <= h){
            int mid = l + (h-l)/2;
            if(poss(arr, mid, m)) l = mid+1;
            else h = mid - 1;
        }
        return h;
    }

    boolean poss(int[] arr, int mid, int m){
        int i = 1;
        int last = arr[0];
        for(int a = 1; a < arr.length; a++){
            if(arr[a] - last >= mid){
                i++;
                last = arr[a];
            }
            if(i == m) return true;
        }
        return false;
    }
}       