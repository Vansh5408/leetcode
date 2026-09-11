class Solution {
    public int[] maxSumOfThreeSubarrays(int[] nums, int k) {
        int []prefix =new int [nums.length-k+1];
        int sum=0;
        for(int i=0;i<k;i++) sum+=nums[i];
        prefix[0]=sum;
        for(int i=k;i<nums.length;i++){
            sum+=nums[i];
            sum-=nums[i-k];
            prefix[i-k+1]=sum;
        }
        int []left = new int [nums.length-k+1];
        int best =0;
        for(int i=0;i<left.length;i++){
            if(prefix[i]>prefix[best]){
                best=i;
            }
            left[i]=best;
        }
        int []right = new int [nums.length-k+1];
        int m =nums.length-k;
        best=m;
        for(int i=m;i>=0;i--){
            if(prefix[i]>=prefix[best]){
                best=i;
            }
            right[i]=best;
        }
        int []ans = new int [3];
        int max =0;
        for(int i=k;i<m-k+1;i++){
            int a = left[i-k];
            int b =right [i+k];
            int total = prefix[a]+prefix[b]+prefix[i];
            if(max<total){
                max=total;
                ans[0]=a;
                ans[1]=i;
                ans[2]=b;
            }
        }
        return ans;
    }
}