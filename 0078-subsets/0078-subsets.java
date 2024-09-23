import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> sub = new ArrayList<>();
        subs(nums, ans, sub, 0);
        return ans;
    }

    void subs(int[] nums, List<List<Integer>> ans, List<Integer> sub, int in)
    {
        if(in == nums.length){
            ans.add(new ArrayList<>(sub));
            return;
        }
        subs(nums, ans, sub, in+1);
        sub.add(nums[in]);
        subs(nums, ans, sub, in+1);
        sub.remove(sub.size()-1);
    }
}