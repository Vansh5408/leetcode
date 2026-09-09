class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        return sum(nums,target,0,0);
    }
    public int sum(int []arr,int k,int i,int curr){
        if(curr==k && i==arr.length) return 1;
        if(i>=arr.length) return 0;
        int first = sum(arr,k,i+1,curr+arr[i]);
        int second =sum(arr,k,i+1,curr-arr[i]);
        return first+second;
    }
}