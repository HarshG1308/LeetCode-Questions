import java.util.*;

class Solution {
    public int partitionString(String s) {
        int ans = 1; 
        Set<Character> set = new HashSet<>();
        for (char c : s.toCharArray()) {
            if (set.contains(c)) {
                ans++; 
                set.clear();
            }
            set.add(c);
        }
        
        return ans;
    }
}
