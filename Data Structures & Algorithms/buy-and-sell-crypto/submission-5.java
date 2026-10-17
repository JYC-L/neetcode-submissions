class Solution {
    public int maxProfit(int[] prices) {
        //implement the two pointer techniques
        int profit = 0;
        int buy = 0;
        int sell = 0;
        while (sell < prices.length) {
            int sellPrice = prices[sell];
            int buyPrice = prices[buy];

            if (sellPrice >= buyPrice) {
                profit = Math.max(sellPrice - buyPrice, profit);
                sell++;
            } else {
                buy = sell;
                sell++;
            }
        }
        return profit;   
        
        //test cases
        //[1, 3, 4, 5]
        //[1, 3, 2, 4]
        //[10, 1, 2, 1]
        //[10, 9, 8, 7, 6]
        //[0, 0, 0]

    }
}
