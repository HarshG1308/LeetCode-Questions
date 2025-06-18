class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int in = -1;
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                in = i;
                break;
            }
        }
        if (in != -1) {
            int m = in + 1;
            for (int i = in + 1; i < n; i++) {
                if (nums[i] > nums[in] && nums[i] <= nums[m]) {
                    m = i;
                }
            }
            swap(nums, in, m);
        }
        reverse(nums, in + 1, n - 1);
    }

    void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    void reverse(int[] nums, int i, int j) {
        while (i < j) {
            swap(nums, i++, j--);
        }
    }
}
