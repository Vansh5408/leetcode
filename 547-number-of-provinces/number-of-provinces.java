class Solution {
    public int findCircleNum(int[][] arr) {
        HashMap<Integer,ArrayList<Integer>>map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(i+1,new ArrayList<>());
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==1){
                    map.get(i+1).add(j+1);
                }
            }
        }
        return connect(map);

    }
    public int connect(HashMap<Integer,ArrayList<Integer>> map){
        HashSet<Integer> set = new HashSet<>();
        Queue<Integer> q = new LinkedList<>();
        int ans =0;
        for(int i=1;i<=map.size();i++){
            if(set.contains(i)){
                continue;
            }
            q.add(i);
            while(!q.isEmpty()){
                int rv = q.poll();
                if(set.contains(rv)){
                    continue;
                }
                set.add(rv);
                for(int j=0;j<map.get(rv).size();j++){
                    int edge = map.get(rv).get(j);
                    if(!set.contains(edge)){
                        q.add(edge);
                    }
                }
            }
            ans++;
        }
        return ans;
    }
}