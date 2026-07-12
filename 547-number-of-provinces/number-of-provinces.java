class Solution {
    public int findCircleNum(int[][] isConnected) {
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        for (int i = 0; i < isConnected.length; i++) {
            map.put(i + 1, new ArrayList<>());
            for (int j = 0; j < isConnected[0].length; j++) {
                if (isConnected[i][j] == 1) {
                    map.get(i + 1).add(j + 1);
                }
            }
        }
        int ans = Count(map);
        return ans;
    }

    public int Count(HashMap<Integer, ArrayList<Integer>> map) {
        int ans =0;
        HashSet<Integer>set = new HashSet<>();
        Queue<Integer>q= new LinkedList<>();
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
                    int edge=map.get(rv).get(j);
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