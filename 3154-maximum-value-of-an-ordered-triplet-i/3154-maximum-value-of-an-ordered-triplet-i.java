class Solution {
    public long maximumTripletValue(int[] nums) {
        long mt = 0, me = 0, md = 0;
        for (int num : nums) {
            mt = Math.max(mt, md * num);
            md = Math.max(md, me - num);
            me = Math.max(me, num);
        }
        return mt;
    }
}