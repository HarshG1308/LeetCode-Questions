class Solution {
    public boolean divideArray(int[] nums) {
        int m = Arrays.stream(nums).max().getAsInt();
        int[] arr = new int[m+1];
        for(int i : nums){
            arr[i]++;
        }
        for(int i : arr){
            if(i % 2 != 0) return false;
        }
        return true;
    }
}
