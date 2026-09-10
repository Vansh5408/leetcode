class Solution { 
    public boolean wordBreak(String s, List<String> arr) { 
        Boolean[] dp = new Boolean[s.length() + 1]; 
        return word(s, arr, 0, dp); 
    } 

    public boolean word(String s, List<String> arr, int start, Boolean[] dp) { 

        if (start == s.length()) {
            return true; 
        }

        if (dp[start] != null) { 
            return dp[start]; 
        }

        for (int end = start + 1; end <= s.length(); end++) { 

            String temp = s.substring(start, end); 

            if (arr.contains(temp)) { 

                boolean ans = word(s, arr, end, dp); 

                if (ans) {
                    return dp[start] = true;
                }
            } 
        } 

        return dp[start] = false; 
    } 
}