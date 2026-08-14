class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        boolean[][] board = new boolean[n][n];

        solve(board, ans, n, 0);

        return ans;
    }

    public void solve(boolean[][] board, List<List<String>> ans, int n, int row) {

        if (n == 0) {
            add(board, ans);
            return;
        }

        for (int col = 0; col < board.length; col++) {

            if (ispossible(col, row, board)) {

                board[row][col] = true;

                solve(board, ans, n - 1, row + 1);

                board[row][col] = false;
            }
        }
    }

    public boolean ispossible(int col, int row, boolean[][] board) {

        // Check column
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col]) {
                return false;
            }
        }

        // Check upper-left diagonal
        int i = row - 1;
        int j = col - 1;

        while (i >= 0 && j >= 0) {
            if (board[i][j]) {
                return false;
            }
            i--;
            j--;
        }

        // Check upper-right diagonal
        i = row - 1;
        j = col + 1;

        while (i >= 0 && j < board.length) {
            if (board[i][j]) {
                return false;
            }
            i--;
            j++;
        }

        return true;
    }

    public void add(boolean[][] board, List<List<String>> ans) {

        List<String> l = new ArrayList<>();

        for (int i = 0; i < board.length; i++) {

            StringBuilder row = new StringBuilder();

            for (int j = 0; j < board.length; j++) {

                if (board[i][j]) {
                    row.append("Q");
                } else {
                    row.append(".");
                }
            }

            l.add(row.toString());
        }

        ans.add(l);
    }
}