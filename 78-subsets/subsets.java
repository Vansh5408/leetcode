class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>ans = new ArrayList<>();
        sets(ans,nums);
        return ans;
    }
    public void sets(List<List<Integer>>ans,int []arr){
        for(int i=0;i<(1<<arr.length);i++){
            List<Integer>l = new ArrayList<>();
            sub(l,i,arr);
            ans.add(l);
        }
    }
    public void sub(List<Integer>ans,int i,int []arr){
        int j=0;
        while(i>0){
            int a =(i&1);
            if(a!=0){
                ans.add(arr[j]);
            }
            i=i>>1;
            j++;
        }
    }
}