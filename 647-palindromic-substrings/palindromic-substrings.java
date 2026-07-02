class Solution {
    public int countSubstrings(String s) {
        int result = 0;
        for(int i = 0; i < s.length(); i++) {
            int even = countPalindromes(i, i + 1, s);
            int odd = countPalindromes(i, i, s);

            result += even + odd;
        }

        return result;
    }

    public  int countPalindromes(int left, int right, String s) {
       int ans =0;
       while(left>=0 && right<s.length()){
        if(s.charAt(left)!=s.charAt(right)){
            return ans;
        }
        ans++;
        left--;
        right++;
       }
       return ans;
    }
}