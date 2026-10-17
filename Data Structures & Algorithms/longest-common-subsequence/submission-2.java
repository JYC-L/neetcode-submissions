class Solution {
    private int[][] mem;

    public int longestCommonSubsequence(String text1, String text2) {
        this.mem = new int[text1.length()][text2.length()];
        for (int[] row: mem) {
            Arrays.fill(row, -1);
        }
        return this.dfs(text1, text2, 0, 0);
    }

    private int dfs(String x, String y, int i, int j) {
        if (i == x.length() || j == y.length()) return 0;
        if (this.mem[i][j] != -1) return mem[i][j];
        if (x.charAt(i) == y.charAt(j)) {
            mem[i][j] = 1 + dfs(x, y, i+1, j+1);
        } else {
            mem[i][j] = Math.max(dfs(x, y, i+1, j), dfs(x, y, i, j+1));
        }
        return mem[i][j];

    }
}
