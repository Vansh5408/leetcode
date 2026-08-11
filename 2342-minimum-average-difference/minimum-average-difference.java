class Solution {
    public int minimumAverageDifference(int[] nums) {
        int n = nums.length;

        long sum = 0;
        for (int num : nums) {
            sum += num;
        }

        long total = 0;
        long average = Long.MAX_VALUE;
        int ans = 0;

        for (int i = 0; i < n; i++) {
            total += nums[i];
            sum -= nums[i];

            long a = total / (i + 1);

            long b = 0;
            if (n - i - 1 != 0) {
                b = sum / (n - i - 1);
            }

            long temp = Math.abs(a - b);

            if (temp < average) {
                average = temp;
                ans = i;
            }
        }

        return ans;
    }
}