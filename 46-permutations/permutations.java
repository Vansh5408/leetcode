class Solution {
    public List<List<Integer>> permute(int[] nums) {
        boolean []temp = new boolean [nums.length];
        Arrays.fill(temp,false);
        List<List<Integer>> ans= new ArrayList<>();
        return permutation(ans,new ArrayList<>(),temp,nums);
    }
    public List<List<Integer>> permutation(List<List<Integer>>ans,List<Integer>l,boolean[]temp,int []arr){

        if(l.size()==arr.length){
            ans.add(new ArrayList<>(l));
            return ans;
        }
        for(int i=0;i<arr.length;i++){
            if(temp[i]!=true){
                temp[i]=true;
                l.add(arr[i]);
                permutation(ans,l,temp,arr);
                l.remove(l.size()-1);
                temp[i]=false;
            }
        }
        return ans;
    }
}