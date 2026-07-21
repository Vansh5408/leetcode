class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->{
            if(a[0]==b[0]) return b[1]-a[1];
            else return a[0]-b[0];
        });
        ArrayList<ArrayList<Integer>>ans = new ArrayList<>();
        int first=intervals[0][0];
        int last = intervals[0][1];
        int a=0;
        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0]>=first && intervals[i][0]<=last){
                if(last<=intervals[i][1]){
                    last=intervals[i][1];
                }
                else{
                    continue;
                }
            }
            else{
                ans.add(new ArrayList<>());
                ans.get(a).add(first);
                ans.get(a).add(last);
                a++;
                first=intervals[i][0];
                last=intervals[i][1];
            }
        }
        ans.add(new ArrayList<>());
        ans.get(a).add(first);
        ans.get(a).add(last);
        int [][]result = new int [ans.size()][2];
        for(int i=0;i<result.length;i++){
            result[i][0]=ans.get(i).get(0);
            result[i][1]=ans.get(i).get(1);
        }
        return result;
    }
}