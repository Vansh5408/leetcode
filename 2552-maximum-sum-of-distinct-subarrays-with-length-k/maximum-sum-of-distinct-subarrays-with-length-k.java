class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long ans =0;
        HashSet<Integer>set = new HashSet<>();
        long sum =0;
        int j=0;
        for(int i=0;i<nums.length;i++){
           while(set.contains(nums[i])){
            set.remove(nums[j]);
            sum-=nums[j];
            j++;
           }
           set.add(nums[i]);
           sum+=nums[i];
           if(i-j+1==k){
            ans=Math.max(ans,sum);
            set.remove(nums[j]);
            sum-=nums[j];
            j++;
           }
        }
        return ans;
    }
}