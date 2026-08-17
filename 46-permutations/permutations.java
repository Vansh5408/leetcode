class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>>ans = new ArrayList<>();
        boolean []arr = new boolean [nums.length];
        swap(ans,nums,arr,new ArrayList());
        return ans;
    }
    public void swap(List<List<Integer>>ans,int []nums,boolean []arr,List<Integer>l){
        if(l.size()==nums.length){
            ans.add(new ArrayList(l));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(arr[i]) continue;
            arr[i]=true;
            l.add(nums[i]);
            swap(ans,nums,arr,l);
            l.remove(l.size()-1);
            arr[i]=false;
        }
    }
}