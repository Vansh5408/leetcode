class Solution {
    public boolean isValid(String s) {

        if(s.length()==1){
            return false;
        }
        Stack <Character>st = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='['){
                st.push(s.charAt(i));
            }
            else{
                if (st.isEmpty()) {
                       return false;
                    }
                if(((s.charAt(i)==')') && (st.peek()=='(')) || ((s.charAt(i)==']') && (st.peek()=='[')) || ((s.charAt(i)=='}') && (st.peek()=='{'))){
                    st.pop();
                }
                else{
                    return false;
                }
            }
        }
        if(st.size()==0){
            return true;
        }
        return false;
    }
}