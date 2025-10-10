class Solution {
    public void sortColors(int[] nums) {
        Arrays.sort(nums);
    }
    void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}