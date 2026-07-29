class Solution {
    public int change(int amount, int[] coins) {
        int[][] dp = new int[coins.length][amount + 1];
        for (int i = 0; i < coins.length; i++) {
            Arrays.fill(dp[i], -1);
        }
        return coin(coins, amount, 0, 0, dp);
    }

    public int coin(int[] arr, int amount, int sum, int idx, int[][] dp) {
        if (sum == amount) {
            return 1;
        }
        if (sum > amount || idx == arr.length) {
            return 0;
        }

        if (dp[idx][sum] != -1) {
            return dp[idx][sum];
        }

        int ans = 0;
        for (int i = idx; i < arr.length; i++) {
            ans += coin(arr, amount, sum + arr[i], i, dp);
        }

        return dp[idx][sum] = ans;
    }
}