class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res = new ArrayList<>();
        char[][] board = new char[n][n];

        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }

        boolean[] col = new boolean[n];
        boolean[] diag1 = new boolean[2 * n - 1]; 
        boolean[] diag2 = new boolean[2 * n - 1]; 

        backtrack(0, n, board, col, diag1, diag2, res);
        return res;
    }

    private void backtrack(int row, int n, char[][] board,
                           boolean[] col, boolean[] diag1,
                           boolean[] diag2, List<List<String>> res) {

        if (row == n) {
            List<String> curr = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                curr.add(new String(board[i]));
            }
            res.add(curr);
            return;
        }

        for (int c = 0; c < n; c++) {
            int d1 = row - c + n - 1;
            int d2 = row + c;

            if (!col[c] && !diag1[d1] && !diag2[d2]) {
                col[c] = diag1[d1] = diag2[d2] = true;
                board[row][c] = 'Q';

                backtrack(row + 1, n, board, col, diag1, diag2, res);

                board[row][c] = '.';
                col[c] = diag1[d1] = diag2[d2] = false;
            }
        }
    }
}