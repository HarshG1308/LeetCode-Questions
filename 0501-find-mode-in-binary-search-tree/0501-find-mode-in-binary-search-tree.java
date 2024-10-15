import java.util.HashMap;
import java.util.ArrayList;

class Solution {
    int maxCnt = 1;

    public int[] findMode(TreeNode root) {
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        helper(root, freqMap);

        ArrayList<Integer> modes = new ArrayList<>();
        for (int key : freqMap.keySet()) {
            if (freqMap.get(key) == maxCnt) {
                modes.add(key);
            }
        }

        int[] res = new int[modes.size()];
        for (int i = 0; i < modes.size(); i++) {
            res[i] = modes.get(i);
        }
        return res;
    }

    private void helper(TreeNode root, HashMap<Integer, Integer> freqMap) {
        if (root == null) {
            return;
        }

        freqMap.put(root.val, freqMap.getOrDefault(root.val, 0) + 1);
        maxCnt = Math.max(maxCnt, freqMap.get(root.val));

        helper(root.left, freqMap);
        helper(root.right, freqMap);
    }
}
