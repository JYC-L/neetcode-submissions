class Solution {
    private int[][] mem;
    public int maxProfit(int[] prices) {
        this.mem = new int[prices.length][2];
        for (int[] i: mem) {
            Arrays.fill(i, -1);
        }
        return this.dfs(prices, 0, 1);
    
    }
    //the profit given the prices list and day and whether you can buy on that day
    private int dfs(int[] prices, int i, int buy) {
        //if can buy, buy = 1, if cannot buy (only can sell), buy == 0
        if (i >= prices.length) return 0;
        if (mem[i][buy] != -1) return mem[i][buy];
        if (buy == 1) {
            return mem[i][buy] = Math.max(dfs(prices, i+1, 0) - prices[i],
            dfs(prices, i+1, 1));
        } 
        return mem[i][buy] = Math.max(dfs(prices, i+2, 1) + prices[i],
        dfs(prices, i+1, 0));
    }

   
}
