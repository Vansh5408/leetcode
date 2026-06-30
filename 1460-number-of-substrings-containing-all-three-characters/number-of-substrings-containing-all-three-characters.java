class Solution {
    public int numberOfSubstrings(String s) {
        int r=0;
        String temp="";
        int ans=0;
        while(r<s.length()){
            temp+=s.charAt(r);
            while(temp.contains("a") && temp.contains("b") && temp.contains("c")){
                ans+=s.length()-r;
                temp=temp.substring(1);
            }
            r++;
        }
        return ans;
    }
}