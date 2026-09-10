class Solution {
    public int longestPalindromeSubseq(String s) {
        int [][]dp = new int [s.length()+1][s.length()+1];
        for(int []arr:dp){
            Arrays.fill(arr,-1);
        }
        return palindrome(s,0,s.length()-1,dp);
    }
    public int palindrome(String s , int l, int r,int [][]dp){
        if(l>r) return 0;
        if(l==r){
            return 1;
        }
        if(dp[l][r]!=-1){
            return dp[l][r];
        }
        if(s.charAt(l)==s.charAt(r)){
            return dp[l][r]=2+palindrome(s,l+1,r-1,dp);
        }
        else{
            int first = palindrome(s,l+1,r,dp);
            int second = palindrome(s,l,r-1,dp);
            return dp[l][r]= Math.max(first,second);
        }
    }
}