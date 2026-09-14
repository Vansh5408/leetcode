class Solution {
    public List<String> letterCasePermutation(String s) {
        List<String> ans = new ArrayList<>();
        Case(ans,0,s.toCharArray());
        return ans;
    }
    static void Case(List<String> ans, int index, char[] arr){
        if(index == arr.length){
            ans.add(new String(arr));
        }else{
            if(Character.isLetter(arr[index])){
                arr[index] = Character.toUpperCase(arr[index]);
                Case(ans,index+1,arr);
                arr[index] = Character.toLowerCase(arr[index]);
                Case(ans,index+1,arr);
            }else{
                Case(ans,index+1,arr);
            }

        }

    }
}