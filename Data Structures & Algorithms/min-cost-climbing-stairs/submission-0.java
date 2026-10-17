class Solution {
    public int[] minCosts;
    public int minCostClimbingStairs(int[] cost) {
        minCosts = new int[cost.length];
        for (int i =0; i < minCosts.length; i++) {
            minCosts[i] = -1;
        }
        return Math.min(this.dfs(cost, 1), this.dfs(cost, 0));
    }

    public int dfs(int[] cost, int pos) {
        if (pos >= cost.length) {
            return 0;
        } 
        if (this.minCosts[pos] != -1) return minCosts[pos];
        return this.minCosts[pos] = cost[pos] + Math.min(dfs(cost, pos+1), dfs(cost, pos+2));
        
    }
}
