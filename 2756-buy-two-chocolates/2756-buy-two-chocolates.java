class Solution {
    public int buyChoco(int[] prices, int budget) {
        Arrays.sort(prices);
        return prices[0] + prices[1] > budget ? budget : budget - prices[0] - prices[1];
    }
}   