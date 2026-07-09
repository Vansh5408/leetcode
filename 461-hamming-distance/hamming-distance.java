class Solution {
    public int hammingDistance(int x, int y) {
        int ans =0;
        int xor = x^y;
        while(xor>0){
            int a =(xor&1);
            if(a==1)ans++;
            xor=xor>>1;
        }
        return ans;
    }
}