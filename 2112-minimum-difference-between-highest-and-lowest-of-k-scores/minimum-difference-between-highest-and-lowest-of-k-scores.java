class Solution {
    public int minimumDifference(int[] nums, int k) {
        if(k==1) return 0;
        Arrays.sort(nums);
        int ans =nums[k-1]-nums[0];
        for(int i=0;i<=nums.length-k;i++){
            ans=Math.min(ans,nums[i+k-1]-nums[i]);
        }
        return ans;
    }
}