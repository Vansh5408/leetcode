class Solution {
    public int reverseBits(int n) {
        int []arr = new int [32];
        int i=0;
        while(n!=0){
            arr[i]=(n)&1;
            n=n>>1;
            i++;
        }
        int j=0;
        int ans =0;
        for(int k=arr.length-1;k>=0;k--){
            ans+=Math.pow(2,j)*arr[k];
            j++;
        }
        return ans;
    }
}