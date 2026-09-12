class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        return sub(ans,nums,0,new ArrayList<>());
    }

     public List<List<Integer>> sub(List<List<Integer>> ans, int []arr, int i,List<Integer>l) {
        if(i==arr.length){
            ans.add(new ArrayList<>(l));
            return ans;
        }
        l.add(arr[i]);
        sub(ans,arr,i+1,l);
        l.remove(l.size()-1);
        sub(ans,arr,i+1,l);
        return ans;
    }

}