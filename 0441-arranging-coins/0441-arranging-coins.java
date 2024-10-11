class Solution {
    public int arrangeCoins(int n) {
        int i = 1, r = 0;
        while(n >= i){
            n -= i;
            i++;
            r++;
        }
        return r;
    }
}