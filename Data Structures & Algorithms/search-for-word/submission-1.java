class Solution {
    private boolean[][] visited;
    private int ROW;
    private int COL;
    
    public boolean exist(char[][] board, String word) {
        this.ROW = board.length;
        this.COL = board[0].length;
        this.visited = new boolean[ROW][COL];
        for (int i = 0; i < ROW; i++) {
            for (int j =0; j < COL; j++) {
                if (this.dfs(i, j, word, 0, board)) {
                    return true;
                }
            }
        }
        return false;
        
    }

    public boolean dfs(int row, int col, String word, int index, char[][] board) {
        if (index == word.length()) return true;
        if (row < 0 || row >= ROW || col < 0 || 
        col >= COL || board[row][col] != word.charAt(index) ||
          visited[row][col]
        ) return false;
        visited[row][col] = true;
        boolean res = this.dfs(row + 1, col, word, index +1, board) ||
        this.dfs(row - 1, col, word, index + 1, board) || 
        this.dfs(row, col + 1, word, index + 1, board) ||
        this.dfs(row, col - 1, word, index + 1, board);
        visited[row][col] = false;
        return res;
    }
}
