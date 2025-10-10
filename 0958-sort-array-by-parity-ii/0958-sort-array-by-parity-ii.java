class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        ArrayList<Integer> odd = new ArrayList<>();
        ArrayList<Integer> even = new ArrayList<>();
        for(int i : nums){
            if(i%2==0)even.add(i);
            else odd.add(i);
        }
        int k = 0, l = 0;
        for(int i = 0; i < nums.length; i++){
            if(i%2==0) nums[i] = even.get(k++);
            else nums[i] = odd.get(l++);
        }
        return nums;
    }
}