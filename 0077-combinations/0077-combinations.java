class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        generate(1,n,new ArrayList(),ans,k);
        return ans;
    }

    void generate(int s, int n, List<Integer> curr, List<List<Integer>> ans, int k){
        if(curr.size() == k) {
            ans.add(new ArrayList(curr));
        }
        for(int i = s; i <= n; i++){
            curr.add(i);
            generate(i+1, n, curr, ans, k);
            curr.remove(curr.size()-1);
        }
    }
}