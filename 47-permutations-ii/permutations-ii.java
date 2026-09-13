class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>>ans = new ArrayList<>();
        boolean []temp = new boolean [nums.length];
        Arrays.fill(temp,false);
        return permute(ans,new ArrayList<>(),nums,temp);
    }
    public List<List<Integer>> permute(List<List<Integer>> ans,List<Integer>l,int []arr,boolean[]temp){
        if(l.size()==arr.length){
            ans.add(new ArrayList<>(l));
            return ans;
        }
        for(int i=0;i<arr.length;i++){
            if(i!=0 && arr[i]==arr[i-1] && temp[i-1]==true) continue;
            else{
                if(temp[i]!=true){
                    l.add(arr[i]);
                    temp[i]=true;
                    permute(ans,l,arr,temp);
                    l.remove(l.size()-1);
                    temp[i]=false;
                }
            }
        }
        return ans;
    }
}