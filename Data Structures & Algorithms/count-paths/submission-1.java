class Solution {
    private int[][] dp;
    public int uniquePaths(int m, int n) {
        this.dp = new int[m-1][n-1];
        return this.dfs(0, 0, m, n);
        
    }

    public int dfs(int i, int j, int m, int n) {
        if (i == m - 1 && j == n - 1) return 1;
        if (i == m || j == n) return 0;

        return dfs(i + 1, j, m, n) + dfs(i, j + 1, m, n);
    }
}
