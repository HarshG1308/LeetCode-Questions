class Solution {
    public int rangeBitwiseAnd(int left, int right) {
        int cnt = 0, ans = 1;
        while(left != right){
            left >>= 1;
            right >>= 1;
            cnt++;
        }
        return (left << cnt);
    }
}