class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        sum(ans,new ArrayList(),candidates,target,0,0);
        return ans;
    }
    public void sum(List<List<Integer>> ans,List<Integer>l,int []arr,int target,int sum,int idx){

        if(sum==target){
            ans.add(new ArrayList(l));
            return ;
        }
        if(sum>target) return;
        for(int i=idx;i<arr.length;i++){
            l.add(arr[i]);
            sum(ans,l,arr,target,sum+arr[i],i);
            l.remove(l.size()-1);
        }
    }
}