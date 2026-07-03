import java.util.*;

class Solution {
    public int miceAndCheese(int[] reward1, int[] reward2, int k) {
        int n = reward1.length;
        int[][] arr = new int[n][2];

        for (int i = 0; i < n; i++) {
            arr[i][0] = reward1[i];
            arr[i][1] = reward2[i];
        }

        Arrays.sort(arr, (a, b) ->
            Integer.compare(a[0] - a[1], b[0] - b[1])
        );

        int ans = 0;

        // Mouse 2 gets the first (n-k) cheeses
        for (int i = 0; i < n - k; i++) {
            ans += arr[i][1];
        }

        // Mouse 1 gets the last k cheeses
        for (int i = n - k; i < n; i++) {
            ans += arr[i][0];
        }

        return ans;
    }
}