class Solution {
    public int numRabbits(int[] answers) {
        Map<Integer, Integer> map = new HashMap<>();
        int total = 0;

        for (int ans : answers) {
            map.put(ans, map.getOrDefault(ans, 0) + 1);
        }

        for (int k : map.keySet()) {
            int groupSize = k + 1;
            int count = map.get(k);
            int groups = (int) Math.ceil((double) count / groupSize);
            total += groups * groupSize;
        }

        return total;
    }
}