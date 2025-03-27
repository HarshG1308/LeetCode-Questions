class Solution {
    public int minimumIndex(List<Integer> nums) {
        int d = find(nums), tc = 0, n = nums.size();
        for(int i : nums) if(i == d) tc++;
        int lc = 0;
        for(int i = 0; i < n; i++){
            if(nums.get(i) == d) lc++;
            int rcnt = tc - lc;
            if((lc > (i + 1) / 2) && (rcnt > (n - i - 1)/2)) return i;
        }
        return -1;
    }

    int find(List<Integer> nums){
        int ans = -1; int cnt = 0;
        for(int i : nums){
            if(cnt == 0){
                ans = i;
                cnt = 1;
            } else if (i == ans) cnt++;
            else cnt--;
        }
        int tc = 0;
        for(int i : nums) if(i == ans) tc++;
        return (tc > nums.size()/2 ? ans : -1);
    }
}