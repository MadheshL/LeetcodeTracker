// Last updated: 11/08/2026, 11:38:10
class Solution {
    public boolean checkXMatrix(int[][] grid) {
        int n = grid.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if (i == j || i + j == n - 1) {
                    if (grid[i][j] == 0) {
                        return false;
                    }
                }
                else {
                    if (grid[i][j] != 0) {
                        return false;
                    }
                }
            }
        }

        return true;
    }
}