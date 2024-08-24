class Solution {
    public int numTrees(int n) {
        return catalan_(n);
    }

    static int catalan_(int n) {
        int[] catalan = new int[n + 1];
        catalan[0] = 1;
        catalan[1] = 1;

        for (int i = 2; i <= n; ++i) {
            catalan[i] = 0;
            for (int j = 0; j < i; ++j) {
                catalan[i] += catalan[j] * catalan[i - j - 1];
            }
        }
        return catalan[n];
    }
}
