class Solution {
    public int hIndex(int[] arr) {
        int ans =0;
        Arrays.sort(arr);
        for(int i=0;i<=arr[arr.length-1];i++){
            int count =0;
            for(int j=0;j<arr.length;j++){
                if(i<=arr[j]) count++;
                if(count>=i){
                    break;
                }
            }
            if(count>=i){
                ans=i;
            }
            else return i-1;
        }
        return ans;
    }
}