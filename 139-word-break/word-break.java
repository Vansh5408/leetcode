class Solution {
    public boolean wordBreak(String s, List<String> arr) {
        Boolean []dp = new Boolean[s.length()+1];
        return word(s,arr,0,dp);
    }
    public boolean word(String s,List<String>arr, int i,Boolean []dp){
        if(i==s.length()) return true;
        if(dp[i]!=null){
            return dp[i];
        }
        for(int j=i;j<s.length();j++){
            String temp=s.substring(i,j+1);
            if(arr.contains(temp)){
                boolean ans =word(s,arr,j+1,dp);
                if(ans){
                    return dp[i]= true;
                }
            }
        }
        return dp[i]=false;
    }
}