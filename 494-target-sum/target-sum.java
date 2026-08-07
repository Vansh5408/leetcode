class Solution {

    public int findTargetSumWays(int[] nums, int target) {

        int sum = 0;
        for (int x : nums)
            sum += x;

        if (Math.abs(target) > sum)
            return 0;

        if ((sum + target) % 2 != 0)
            return 0;

        int req = (sum + target) / 2;

        return find(nums, req, 0);
    }

    public int find(int[] arr, int sum, int i) {

        if (i == arr.length) {
            return sum == 0 ? 1 : 0;
        }

        int first = 0;

        if (arr[i] <= sum)
            first = find(arr, sum - arr[i], i + 1);

        int second = find(arr, sum, i + 1);

        return first + second;
    }
}