class Solution {
    public List<List<String>> partition(String s) {
      List<List<String>> ans = new ArrayList<>();
      return part(s,0,ans,new ArrayList<String>());  
    }
    public List<List<String>> part(String s,int index,List<List<String>> ans,List<String>l) {

        if(index==s.length()){
            ans.add(new ArrayList<>(l));
            return ans;
        }
        for(int i=index;i<s.length();i++){
            if(palindrome(s,index,i)){
                l.add(s.substring(index,i+1));
                part(s,i+1,ans,l);
                l.remove(l.size()-1);
            }
        }
        return ans;
    }

    public boolean palindrome(String s , int i ,int j){
        while(i<=j){
            if(s.charAt(i)!=s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}