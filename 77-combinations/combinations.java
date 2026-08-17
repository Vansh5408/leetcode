class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>>ans = new ArrayList<>();
        genrate(ans,new ArrayList(),1,n,k);
        return ans;
    }
    public void genrate(List<List<Integer>>ans,List<Integer>l,int idx,int n,int k){
    if(l.size()==k){
        ans.add(new ArrayList(l));
        return;
    }
    for(int i=idx;i<=n;i++){
        if(l.size()!=0 && i==idx){
            continue;
        }
        l.add(i);
        genrate(ans,l,i,n,k);
        l.remove(l.size()-1);
    }
}
}