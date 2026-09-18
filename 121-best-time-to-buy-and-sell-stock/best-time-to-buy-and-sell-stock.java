class Solution {
    public int maxProfit(int[] prices) {
        int ans =0;
        int buy=Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<buy){
                buy=prices[i];
            }
            else{
                ans=Math.max(ans,prices[i]-buy);
            }
        }
        return ans;
    }
}