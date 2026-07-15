class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
      List<List<Integer>>ans = new ArrayList<>();
      sum(candidates,target,0,new ArrayList(),ans);
      return ans;
    }
    public void sum(int []arr,int target,int idx,List<Integer>temp,List<List<Integer>>ans){
        if(target==0){
            ans.add(new ArrayList(temp));
        }
        if(target<0){
            return;
        }
        for(int i=idx;i<arr.length;i++){
            temp.add(arr[i]);
            sum(arr,target-arr[i],i,temp,ans);
            temp.remove(temp.size()-1);
        }
    }
}