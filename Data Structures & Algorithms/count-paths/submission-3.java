class Solution {
    //bottom up 
    public int uniquePaths(int m, int n) {
        int[][] mem = new int[m+1][n+1];
        mem[m-1][n-1] = 1;
        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                mem[i][j] += mem[i+1][j] + mem[i][j+1];
            }
        }

        return mem[0][0];
        
        
    }
}
