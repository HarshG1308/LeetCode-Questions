class Solution {
    public int poorPigs(int buck, int die, int test) {
        int t = test / die;
        int l = 0, h = buck, ans = 0;
        while(l <= h){
            int mid = (l + h) / 2;
            if(Math.pow((t+1), mid) >= buck) h = mid - 1; 
            else l = mid + 1;
        }
        return l;
    }
}