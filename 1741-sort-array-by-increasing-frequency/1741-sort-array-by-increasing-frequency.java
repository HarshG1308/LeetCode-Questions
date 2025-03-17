class Solution {
    public int[] frequencySort(int[] nums) {
        Integer[] n = new Integer[nums.length];
        for(int i = 0; i < nums.length; i++) n[i] = nums[i]; 
        Map<Integer, Integer> map = new HashMap<>();
        for(int i : n) map.put(i, map.getOrDefault(i, 0) + 1);
        Arrays.sort(n, (a,b) -> map.get(a) != map.get(b) ? map.get(a) - map.get(b) : b - a);
        for(int i = 0; i < nums.length; i++) nums[i] = n[i]; 
        return nums;
    }
}