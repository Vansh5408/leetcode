class Solution {
    public int longestPalindromeSubseq(String s) {
        int [][]dp = new int [s.length()+1][s.length()+1];
        for(int []arr:dp){
            Arrays.fill(arr,-1);
        }
        return subsequence(s,0,s.length()-1,dp);
    }
    public int subsequence(String s , int l, int r,int [][]dp){
        if(l>r) return 0;
        if(l==r) return 1;
        int ans=0;
        if(dp[l][r]!=-1){
            return dp[l][r];
        }
        if(s.charAt(l)==s.charAt(r)){
            return ans+=2+subsequence(s,l+1,r-1,dp);
        }
        else{
            int first=subsequence(s,l+1,r,dp);
            int second=subsequence(s,l,r-1,dp);
            ans+=Math.max(first,second);
        }
        return dp[l][r]=ans;
    }
}