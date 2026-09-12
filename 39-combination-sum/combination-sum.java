class Solution {
    public List<List<Integer>> combinationSum(int[] arr, int target) {
        List<List<Integer>>ans = new ArrayList<>();
        return combination(ans,new ArrayList<>(),target,arr,0);
    }

     public List<List<Integer>> combination(List<List<Integer>>ans,List<Integer>l,int target,int[] arr, int i){
         if(i==arr.length) return ans;
        if(target==0){
            ans.add(new ArrayList<>(l));
            return ans;
        }
        if(target<0){
            return ans;
        }
        for(int j=i;j<arr.length;j++){
            l.add(arr[j]);
            combination(ans,l,target-arr[j],arr,j);
            l.remove(l.size()-1);
        }
        return ans;
     }
    
}