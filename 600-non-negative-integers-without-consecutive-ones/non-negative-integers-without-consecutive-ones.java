class Solution {

    public int findIntegers(int n) {

        int[] dp = new int[32];

        dp[0] = 1;
        dp[1] = 2;

        for (int i = 2; i < 32; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        int answer = 0;

        int previousBit = 0;

        for (int i = 30; i >= 0; i--) {

            int currentBit = (n >> i) & 1;

            if (currentBit == 1) {

                answer += dp[i];

                if (previousBit == 1)
                    return answer;

                previousBit = 1;

            } else {

                previousBit = 0;
            }
        }

        return answer + 1;
    }
}