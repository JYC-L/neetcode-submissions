class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int largest = 0;
        for (int i = 0; i < grid.length; i++){
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    largest = Math.max(largest, this.dfs(grid, i, j));
                }     
            }
        }
        return largest;
        
    }

    public int dfs(int[][] grid, int i, int j) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length) {
            return 0;
        }
        int area = 0;
        if (grid[i][j] == 1) {
            area++;
            grid[i][j] = 0;
            area += dfs(grid, i+1, j);
            area += dfs(grid, i-1, j);
            area += dfs(grid, i, j+1);
            area += dfs(grid, i, j-1);
        }
        return area;
        
    }
}

