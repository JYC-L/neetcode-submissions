class Solution {
    public int uniquePaths(int m, int n) {
        return this.dfs(0, 0, m, n);
        
    }

    public int dfs(int x, int y, int m, int n) {  
        if (x == m - 1 && y == n - 1) {
            return 1;
        } 
        if (x == m - 1) return dfs(x, y+1, m, n);
        if (y == n - 1) return dfs(x+1, y, m, n);
        return this.dfs(x + 1, y, m, n) + this.dfs(x, y + 1, m, n);
    }
}
