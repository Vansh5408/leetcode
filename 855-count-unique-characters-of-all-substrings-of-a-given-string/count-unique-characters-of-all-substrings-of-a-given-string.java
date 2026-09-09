class Solution {
    public int uniqueLetterString(String s) {
        int n = s.length();
        int []prev = new int [n];
        int []last= new int [n];
        int []temp = new int [26];
        Arrays.fill(temp,-1);
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            prev[i]=temp[ch-'A'];
            temp[ch-'A']=i;
        }
        Arrays.fill(temp,n);
        for(int i=n-1;i>=0;i--){
            char ch = s.charAt(i);
            last[i]=temp[ch-'A'];
            temp[ch-'A']=i;
        }
        int ans =0;;
        for(int i=0;i<n;i++){
            ans+=(last[i]-i)*(i-prev[i]);
        }
        return ans;
    }
}