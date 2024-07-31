class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n1 = nums1.length, n2 = nums2.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        Stack<Integer> s = new Stack<>();
        for (int i = n2 - 1; i >= 0; i--) {
            int num = nums2[i];
            while (!s.isEmpty() && s.peek() <= num) {
                s.pop();
            }
            if (!s.isEmpty()) {
                map.put(num, s.peek());
            } else {
                map.put(num, -1); 
            }
            s.push(num);
        }
        
        int[] ans = new int[n1];
        for (int i = 0; i < n1; i++) {
            ans[i] = map.get(nums1[i]);
        }
        
        return ans;
    }
}