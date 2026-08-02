class Solution {

    public int findTargetSumWays(int[] nums, int target) {
        return ways(nums, target, 0, 0);
    }

    public int ways(int[] nums, int target, int sum, int i) {

        if (i == nums.length) {
            if (sum == target)
                return 1;
            else
                return 0;
        }

        int first = ways(nums, target, sum - nums[i], i + 1);

        int second = ways(nums, target, sum + nums[i], i + 1);

        return first + second;
    }
}