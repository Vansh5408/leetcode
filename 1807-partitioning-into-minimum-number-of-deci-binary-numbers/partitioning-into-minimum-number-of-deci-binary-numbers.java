class Solution {
    public int minPartitions(String s) {
        int ans =0;
        for(int i=0;i<s.length();i++){
            ans=Math.max(ans,s.charAt(i)-'0');
            if(ans==9) return ans;
        }
        return ans;
    }
}