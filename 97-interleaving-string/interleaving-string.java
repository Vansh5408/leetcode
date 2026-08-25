class Solution {
    public boolean isInterleave(String s1, String s2, String s3) {
        if(s1.length()+s2.length()!=s3.length()) return false;
        int [][]dp = new int [s1.length()+1][s2.length()+1];
        for(int []num:dp){
            Arrays.fill(num,-1);
        }
        return inter(s1, s2, s3, 0, 0,dp);
    }

    public boolean inter(String s1, String s2, String s3, int i, int j,int [][]dp) {
        if (i+j==s3.length()){
              return true;
        }
        if(dp[i][j]!=-1){
            if(dp[i][j]==0) return false;
            return true;
        }
        boolean ans = false;
        if (i<s1.length() && s1.charAt(i) == s3.charAt(i + j)) {
            ans =ans|| inter(s1, s2, s3, i + 1, j,dp);
        }
        if (j<s2.length() && s2.charAt(j) == s3.charAt(i + j)) {
            ans =ans|| inter(s1, s2, s3, i, j + 1,dp);
        }
        if(ans==true) dp[i][j]=1;
        if(ans==false) dp[i][j]=0;
        return ans;
    }
}