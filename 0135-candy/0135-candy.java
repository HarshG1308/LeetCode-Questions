class Solution {
    public int candy(int[] ratings) {
        int n = ratings.length;
        int[] dist = new int[n];
        Arrays.fill(dist, 1);
        for (int i = 1; i < n; i++)
            if (ratings[i] > ratings[i - 1])
                dist[i] = dist[i - 1] + 1;
        for (int i = n - 1; i > 0; i--)
            if (ratings[i] < ratings[i - 1] && dist[i] >= dist[i - 1])
                dist[i - 1] = dist[i] + 1;
        return Arrays.stream(dist).sum();
    }
}