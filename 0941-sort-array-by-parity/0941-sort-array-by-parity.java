class Solution {
    public int[] sortArrayByParity(int[] nums) {
        List<Integer> odd = new ArrayList<>();
        List<Integer> even = new ArrayList<>();
        for(int i : nums){
            if(i%2==0) even.add(i);
            else odd.add(i);
        }
        int[] ans = new int[nums.length];
        int k = 0;
        for(int i = 0; i < even.size(); i++){
            ans[k++] = even.get(i);
        }
        for(int i = 0; i < odd.size(); i++){
            ans[k++] = odd.get(i);
        }
        return ans;
    }
}