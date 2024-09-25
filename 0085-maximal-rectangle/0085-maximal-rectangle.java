class Solution {
    public int maximalRectangle(char[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) return 0;
        
        int max = 0;
        int[] curr = new int[matrix[0].length];
        
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == '1') {
                    curr[j] += 1;
                } else {
                    curr[j] = 0;
                }
            }
            int cm = largestArea(curr);
            max = Math.max(max, cm);
        }
        
        return max;
    }

    int largestArea(int[] heights) {
        int[] ns = nextSmaller(heights);
        int[] ps = previousSmaller(heights);
        int max = 0;
        int n = heights.length;
        
        for(int i = 0; i < n; i++) {
            int width = ns[i] - ps[i] - 1;
            max = Math.max(max, width * heights[i]);
        }
        
        return max;
    }

    int[] nextSmaller(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        Stack<Integer> s = new Stack<>();
        
        for(int i = n - 1; i >= 0; i--) {
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            if(s.isEmpty()) ans[i] = n;  
            else ans[i] = s.peek();
            s.push(i);
        }
        return ans;
    }

    int[] previousSmaller(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        Stack<Integer> s = new Stack<>();
        
        for(int i = 0; i < n; i++) {
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            if(s.isEmpty()) ans[i] = -1;  
            else ans[i] = s.peek();
            s.push(i);
        }
        return ans;
    }
}
