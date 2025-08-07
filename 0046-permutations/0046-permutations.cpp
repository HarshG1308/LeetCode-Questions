class Solution {
public:
   vector<vector<int>>k;
   void pere(vector<int>v,int i=0)
   {
       if(i==v.size()-1)
       {
           k.push_back(v);return;
       }
       for(int j = i;j<v.size();j++)
       {
           swap(v[i],v[j]);
           pere(v,i+1);
           swap(v[i],v[j]);
       }
   }
    vector<vector<int>> permute(vector<int>& nums) {
        pere(nums);
        return k;
    }
};