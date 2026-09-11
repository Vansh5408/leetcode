class Solution {
    public int alternatingSubarray(int[] nums) {
        int ans = -1;
        int len =1;
        for(int i=1;i<nums.length;i++){
            int diff = nums[i]-nums[i-1];
            int exp=(len%2==1)?1:-1;
            if(diff==exp){
                len++;
                ans=Math.max(len,ans);
            }
            else if(diff==1){
                len =2;
                ans=Math.max(len,ans);
            }
            else {
                len =1;
            }
        }
        return ans;
    }
}