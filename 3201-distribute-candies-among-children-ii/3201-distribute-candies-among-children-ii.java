class Solution{
public long distributeCandies(int n, int limit) {
    long ans = 0;
    for (int i = Math.max(0, n - 2 * limit); i <= Math.min(n, limit); i++) {
        int remaining = n - i;
        int minJ = Math.max(0, remaining - limit);
        int maxJ = Math.min(limit, remaining);
        ans += (maxJ - minJ + 1);
    }
    return ans;
}
}