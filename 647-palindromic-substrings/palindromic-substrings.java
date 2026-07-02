class Solution {
    public int countSubstrings(String s) {
        int count =0;
        String temp="";
        for(int i=0;i<s.length();i++){
            count++;
            int l =i+1;
            temp+=s.charAt(i);
            while(l<s.length()){
                temp+=s.charAt(l);
                if(check(temp)) count++;
                l++;
            }
            temp="";

        }
        return count;
    }
    public boolean check(String s){
        int l=0;
        int r=s.length()-1;
        while(l<=r){
            if(s.charAt(l)!=s.charAt(r)) return false;
            l++;
            r--;
        }
        return true;
    }
}