class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1; int max = 0;
        for(int i : piles) max = Math.max(i,max);
        while(l <= max){
            int mid = l + (max-l)/2;
            if(canEat(piles, h, mid)) max = mid-1;
            else l = mid + 1;
        }
        return l;
    }
    boolean canEat(int[] arr, int h, int k){
        int t = 0;
        for(int i : arr) t += Math.ceil((double)(i)/k);
        return t <= h;
    }
}