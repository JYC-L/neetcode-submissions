class Solution {
    private int[][] dp;
    public int uniquePaths(int m, int n) {
        this.dp = new int[m][n];
        for (int[] i: dp) {
            Arrays.fill(i, -1);
        }
        return this.dfs(0, 0, m, n);
        
    }

    public int dfs(int i, int j, int m, int n) {
        if (i == m - 1 && j == n - 1) return 1;
        if (i >= m || j >= n) return 0;
        if (dp[i][j] != -1) return dp[i][j];

        return dp[i][j] = dfs(i + 1, j, m, n) + dfs(i, j + 1, m, n);
    }
}


