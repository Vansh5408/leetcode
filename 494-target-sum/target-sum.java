class Solution {

    Integer[][] dp = new Integer[21][2001];

    public int findTargetSumWays(int[] nums, int target) {
        return ways(nums, target, 0, 0);
    }

    public int ways(int[] nums, int target, int sum, int i) {

        // Base Case
        if (i == nums.length) {
            return (sum == target) ? 1 : 0;
        }

        // Already calculated
        if (dp[i][sum + 1000] != null) {
            return dp[i][sum + 1000];
        }

        // Choose +
        int plus = ways(nums, target, sum + nums[i], i + 1);

        // Choose -
        int minus = ways(nums, target, sum - nums[i], i + 1);

        // Store answer
        dp[i][sum + 1000] = plus + minus;

        return dp[i][sum + 1000];
    }
}