class Solution {
    public int largestRectangleArea(int[] heights) {
        int[] ns = nextsmaller(heights);
        int[] ps = previoussmaller(heights);
        int max = Integer.MIN_VALUE, n = heights.length;
        for(int i = 0; i < n; i++){
            max = Math.max(max, (ps[i]-ns[i]-1)*heights[i]);
        }
        return max;
    }

    int[] nextsmaller(int[] arr){
        int n = arr.length;
        int[] ans = new int[n];
        Stack<Integer> s = new Stack<>();
        for(int i= 0; i < n; i++){
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
                s.pop();
            }
            if(s.isEmpty()) ans[i] = -1;
            else ans[i] = s.peek();
            s.push(i);
        }
        return ans;
    }

    int[] previoussmaller(int[] arr){
        int n = arr.length;
        int[] ans = new int[n];
        Stack<Integer> s = new Stack<>();
        for(int i= n-1; i >= 0; i--){
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
                s.pop();
            }
            if(s.isEmpty()) ans[i] = n;
            else ans[i] = s.peek();
            s.push(i);
        }
        return ans;
    }
}