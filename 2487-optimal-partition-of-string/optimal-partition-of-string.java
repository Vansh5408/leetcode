class Solution {
    public int partitionString(String s) {
        int[] arr = new int[26];
        int ans = 1;

        for (int i = 0; i < s.length(); i++) {
            int index = s.charAt(i) - 'a';

            if (arr[index] == 1) {
                // Start a new substring
                arr = new int[26];
                ans++;
            }

            arr[index] = 1;
        }

        return ans;
    }
}