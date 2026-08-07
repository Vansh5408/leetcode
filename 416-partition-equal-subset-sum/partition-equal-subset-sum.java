class Solution {
    public boolean canPartition(int[] nums) {

        int sum = 0;
        for (int x : nums)
            sum += x;

        if (sum % 2 != 0)
            return false;

        sum /= 2;

        int[][] dp = new int[nums.length][sum + 1];
        for (int[] a : dp)
            Arrays.fill(a, -1);

        return partition(nums, 0, sum, 0, dp);
    }

    public boolean partition(int[] arr, int curr_sum, int target, int i, int[][] dp) {

        if (curr_sum == target)
            return true;

        if (i == arr.length || curr_sum > target)
            return false;

        if (dp[i][curr_sum] != -1)
            return dp[i][curr_sum] == 1;

        boolean first = partition(arr, curr_sum + arr[i], target, i + 1, dp);
        boolean second = partition(arr, curr_sum, target, i + 1, dp);

        boolean ans = first || second;

        dp[i][curr_sum] = ans ? 1 : 0;

        return ans;
    }
}