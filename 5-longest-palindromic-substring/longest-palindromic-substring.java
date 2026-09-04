class Solution {
    public String longestPalindrome(String s) {
        if (s.length() <= 1) return s;

        String ans = "";
        String temp;

        for (int a = 0; a < s.length(); a++) {
            for (int i = a; i < s.length(); i++) {
                temp = s.substring(a, i + 1);
                if (longest(temp) && temp.length() > ans.length()) {
                    ans = temp;
                }
            }
        }

        return ans;
    }

    public boolean longest(String s) {
        int l = 0, r = s.length() - 1;
        while (l <= r) {
            if (s.charAt(l) != s.charAt(r)) return false;
            l++;
            r--;
        }
        return true;
    }
}
