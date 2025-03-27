class Solution {
    public boolean increasingTriplet(int[] nums) {
        int m = Integer.MAX_VALUE, n = Integer.MAX_VALUE;
        for(int i : nums){
            if(m >= i) m = i;
            else if (n >= i) n = i;
            else return true;
        }
        return false;
    }
}