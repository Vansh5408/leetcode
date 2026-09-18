class Solution {
    public int lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length + 1];
        Arrays.fill(dp, -1);
        int ans = 1;
        for (int i = 0; i < nums.length; i++) {
            ans = Math.max(ans, lis(i, nums, dp));
        }
        return ans;
    }

    public int lis(int i, int[] arr, int[] dp) {
        if (i == arr.length)
            return 0;
        int ans = 1;
        for (int j = i + 1; j < arr.length; j++) {
            if (dp[i] != -1) {
                return dp[i];
            }
            if (arr[i] < arr[j]) {
                int count = 1 + lis(j, arr, dp);
                ans = Math.max(ans, count);
            }
        }
        return dp[i] = ans;
    }
}