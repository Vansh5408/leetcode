class Solution {
    public int partitionString(String s) {
        int []arr = new int [26];
        int ans =1;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(arr[ch-'a']==0){
                arr[ch-'a']++;
            }
            else{
                ans++;
                Arrays.fill(arr,0);
                arr[ch-'a']++;
            }
        }
        return ans;
    }
}