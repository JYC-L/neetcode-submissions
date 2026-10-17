class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;

        //binary search with the rows
        int top = 0;
        int bot = row - 1;
        while (top <= bot) {
            int mid = (top + bot)/2;
            if (target > matrix[mid][col-1]) {
                top = mid + 1;
            } else if (target < matrix[mid][0]) {
                bot = mid - 1;
            } else {
                break;
            }
        }
        //edge case for number larger than last number pre row and smaller
        //then first numb the next row => target not in matrix
        if (!(top<=bot)) {
            return false;
        }

        //binary search with the columns in the identified row
        int l = 0;
        int r = col - 1;
        int currentRow = (top + bot)/2;
        while (l <= r) {
            int mid = (l + r)/2;
            if (target > matrix[currentRow][mid]) {
                l = mid + 1;
            } else if (target < matrix[currentRow][mid]) {
                r = mid - 1;
            } else {
                return true;
            }
        }
        return false;

        
    }
}
