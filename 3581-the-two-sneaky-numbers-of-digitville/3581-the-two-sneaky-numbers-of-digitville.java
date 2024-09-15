class Solution {
    public int[] getSneakyNumbers(int[] nums) 
    {
        int max = Integer.MIN_VALUE;
        for(int i : nums)
        {
            max = Math.max(max,i);
        }

        boolean[] arr = new boolean[max+1];
        
        for(int i : nums)
        {
            if(arr[i] == false) arr[i] = true;
            else arr[i] = false;
        }

        List<Integer> ans = new ArrayList<>();
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] == false) ans.add(i);
        }

        int[] array = new int[ans.size()];
        for(int i = 0; i < ans.size(); i++) array[i] = ans.get(i);

        return array;
    }
}