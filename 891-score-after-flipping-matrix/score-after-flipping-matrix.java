class Solution {
    public int matrixScore(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            if (grid[i][0] == 0) {
                for (int j = 0; j < grid[0].length; j++) {
                    grid[i][j] = 1 - grid[i][j];
                }
            }
        }
        for (int i = 1; i < grid[0].length; i++) {
            int ones = 0;

            for (int j = 0; j < grid.length; j++) {
                if (grid[j][i] == 1) {
                    ones++;
                }
            }

            int zeros = grid.length - ones;

            if (zeros > ones) {
                for (int j = 0; j < grid.length; j++) {
                    grid[j][i] = 1 - grid[j][i];
                }
            }
        }
        int ans = 0;

        for (int i = 0; i < grid.length; i++) {
            String s = "";

            for (int j = 0; j < grid[0].length; j++) {
                s += grid[i][j];
            }

            ans += decimal(s);
        }

        return ans;
    }

    public int decimal(String s) {
        return Integer.parseInt(s, 2);
    }
}