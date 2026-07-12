class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int []temp = Arrays.copyOf(arr,arr.length);
        Arrays.sort(temp);
        HashMap<Integer,Integer>map = new HashMap<>();
        int a=1;
        int []ans = new int [arr.length];
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(temp[i])){
                continue;
            }
            else{
                map.put(temp[i],a);
                a++;
            }
        }
        for(int i=0;i<arr.length;i++){
            int b =map.get(arr[i]);
            ans[i]=b;
        }
        return ans;
    }
}