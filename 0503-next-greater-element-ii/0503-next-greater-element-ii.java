class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        int res[]=new int[n];
        ///vector<int> ves(n,-1);
        
        for(int i=0;i<nums.length;i++)
        {
            int x=nums[i];
            for(int j=0;j<n;j++)
            {
                if(x<nums[(j+i)%n])
                {
                    res[i]=nums[(j+i)%n];
                    break;
                }
                else res[i]=-1;
            }
        }
        return res;
    }
}