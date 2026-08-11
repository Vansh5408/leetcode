class Solution {
    public int waysToSplitArray(int[] nums) {
        long sum =0;
        int ans =0;
        for(int i=0;i<nums.length;i++) sum+=nums[i];
        long total =0;
        for(int i=0;i<nums.length-1;i++){
            total+=nums[i];
            sum-=nums[i];
            if(total>=sum){
                ans++;
            }
        }
        return ans;
    }
}