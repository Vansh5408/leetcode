class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>>ans = new ArrayList<>();
        return combination(ans,new ArrayList<>(),k,n,1);
    }

    public List<List<Integer>> combination(List<List<Integer>>ans,List<Integer>l,int k, int target,int m) {
        if(target==0 && l.size()==k){
            ans.add(new ArrayList<>(l));
            return ans;
        }
        if(target<0 || l.size()>=k) return ans;
       
        for(int j=m;j<=9;j++){
            l.add(j);
            combination(ans,l,k,target-j,j+1);
             l.remove(l.size()-1);
        }
       
       return ans;
    }
}