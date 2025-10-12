import java.util.*;

class Solution {
    Map<Integer, Long> totalMap = new HashMap<>();
    List<Integer> powers;
    long[] memo;

    public long maximumTotalDamage(int[] power) {
        for (int p : power)
            totalMap.put(p, totalMap.getOrDefault(p, 0L) + p);

        powers = new ArrayList<>(totalMap.keySet());
        Collections.sort(powers);

        memo = new long[powers.size()];
        Arrays.fill(memo, -1);

        return dfs(0);
    }

    private long dfs(int i) {
        if (i >= powers.size())
            return 0;
        if (memo[i] != -1)
            return memo[i];

        long skip = dfs(i + 1);

        long take = totalMap.get(powers.get(i));

        int j = i + 1;
        while (j < powers.size() && powers.get(j) - powers.get(i) <= 2)
            j++;

        take += dfs(j);

        memo[i] = Math.max(skip, take);
        return memo[i];
    }
}
